/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.themes.sbadmin2.chat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.plugins.bootstrap.options.BSClearfixOptions;
import com.jwebmp.plugins.bootstrap.options.BSColoursOptions;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap.themes.sbadmin2.SB2ThemeClasses;
import com.jwebmp.plugins.moment.Moment;

import java.util.Date;

/**
 * A SB2 chat message that is aligned to the left
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 17, 2016
 */
public class SB2ChatRightMessage
		extends ListItem
		implements ISB2ChatMessage
{


	/**
	 * The actual header text
	 */
	private String headerText;
	/**
	 * The date for the message
	 */
	private Date messageDate;
	/**
	 * The actual message
	 */
	private String message;
	@JsonIgnore
	private Span messageImageSpan;
	@JsonIgnore
	private Image messageImage;
	@JsonIgnore
	private Div chatBody;
	@JsonIgnore
	private Div chatBodyHeader;

	/**
	 * A Chat message that is left aligned
	 */
	public SB2ChatRightMessage()
	{
		addClass(BSDefaultOptions.Right);
		addClass(BSClearfixOptions.Clearfix);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getMessageImageSpan().add(getMessageImage());
			getMessageImageSpan().addClass(BSDefaultOptions.Pull_Right);
			add(getMessageImageSpan());

			Strong headerStrong = new Strong(headerText);
			headerStrong.addClass(BSDefaultOptions.Primary_Font);
			headerStrong.addClass(BSDefaultOptions.Pull_Right);

			SmallText st = new SmallText();
			Moment m = new Moment(messageDate, ComponentTypes.Span);
			st.addClass(BSColoursOptions.Text_Muted);

			st.add(m);

			getChatBodyHeader().add(st);
			getChatBodyHeader().add(headerStrong);

			getChatBody().add(message);

			add(getChatBody());
		}

		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getHeaderText() != null ? getHeaderText().hashCode() : 0);
		result = 31 * result + (getMessageDate() != null ? getMessageDate().hashCode() : 0);
		result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
		result = 31 * result + (getMessageImageSpan() != null ? getMessageImageSpan().hashCode() : 0);
		result = 31 * result + (getMessageImage() != null ? getMessageImage().hashCode() : 0);
		result = 31 * result + getChatBody().hashCode();
		result = 31 * result + getChatBodyHeader().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SB2ChatRightMessage))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		SB2ChatRightMessage that = (SB2ChatRightMessage) o;

		if (getHeaderText() != null ? !getHeaderText().equals(that.getHeaderText()) : that.getHeaderText() != null)
		{
			return false;
		}
		if (getMessageDate() != null ? !getMessageDate().equals(that.getMessageDate()) : that.getMessageDate() != null)
		{
			return false;
		}
		if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null)
		{
			return false;
		}
		if (getMessageImageSpan() != null ? !getMessageImageSpan().equals(that.getMessageImageSpan()) : that.getMessageImageSpan() != null)
		{
			return false;
		}
		if (getMessageImage() != null ? !getMessageImage().equals(that.getMessageImage()) : that.getMessageImage() != null)
		{
			return false;
		}
		if (!getChatBody().equals(that.getChatBody()))
		{
			return false;
		}
		return getChatBodyHeader().equals(that.getChatBodyHeader());
	}

	/**
	 * Gets the text for the header
	 *
	 * @return
	 */
	public String getHeaderText()
	{
		return headerText;
	}

	/**
	 * Sets the text for the header
	 *
	 * @param headerText
	 */
	public void setHeaderText(String headerText)
	{
		this.headerText = headerText;
	}

	/**
	 * Returns the assigned message ate
	 *
	 * @return
	 */
	public Date getMessageDate()
	{
		return messageDate;
	}

	/**
	 * Sets the assigned message date
	 *
	 * @param messageDate
	 */
	public void setMessageDate(Date messageDate)
	{
		this.messageDate = messageDate;
	}

	/**
	 * Returns the message
	 *
	 * @return
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Returns the container span for the message image
	 *
	 * @return
	 */
	public Span getMessageImageSpan()
	{
		if (messageImageSpan == null)
		{
			setMessageImageSpan(new Span());
		}
		return messageImageSpan;
	}

	/**
	 * Returns this message image
	 *
	 * @return
	 */
	public Image getMessageImage()
	{
		if (messageImage == null)
		{
			setMessageImage(new Image(""));
		}
		return messageImage;
	}

	/**
	 * Sets the image for the message
	 *
	 * @param messageImage
	 */
	public void setMessageImage(Image messageImage)
	{
		this.messageImage = messageImage;
		if (this.messageImage != null)
		{
			this.messageImage.addClass(BSDefaultOptions.Img_Circle);
		}
	}

	/**
	 * Returns the given chat body
	 *
	 * @return
	 */
	public Div getChatBody()
	{
		if (chatBody == null)
		{
			setChatBody(new Div());
		}
		return chatBody;
	}

	/**
	 * Sets the given chat body
	 *
	 * @param chatBody
	 */
	public void setChatBody(Div chatBody)
	{
		this.chatBody = chatBody;
		if (this.chatBody != null)
		{
			this.chatBody.addClass(SB2ThemeClasses.Chat_Body);
			this.chatBody.addClass(BSClearfixOptions.Clearfix);
		}
	}

	/**
	 * Returns the div that contains the body header
	 *
	 * @return
	 */
	public Div getChatBodyHeader()
	{
		if (chatBodyHeader == null)
		{
			setChatBodyHeader(new Div());
		}
		return chatBodyHeader;
	}

	/**
	 * Sets the chat body header
	 *
	 * @param chatBodyHeader
	 */
	public void setChatBodyHeader(Div chatBodyHeader)
	{
		this.chatBodyHeader = chatBodyHeader;
		if (this.chatBodyHeader != null)
		{
			this.chatBodyHeader.addClass("header");
			getChatBody().add(this.chatBodyHeader);
		}
	}

	/**
	 * Sets the container span for the message image
	 *
	 * @param messageImageSpan
	 */
	public void setMessageImageSpan(Span messageImageSpan)
	{
		this.messageImageSpan = messageImageSpan;
		if (this.messageImageSpan != null)
		{
			this.messageImageSpan.addClass(SB2ThemeClasses.Chat_Img);
			this.messageImageSpan.addClass(BSDefaultOptions.Pull_Right);
		}
	}

	/**
	 * Sets the message
	 *
	 * @param message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
}
