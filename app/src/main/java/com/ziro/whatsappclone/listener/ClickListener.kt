package com.ziro.whatsappclone.listener

import com.ziro.whatsappclone.util.StatusListElement

interface ContactsClickListener {
    fun onContactClicked(name: String?, phone: String?)
}

interface ChatClickListener {
    fun onChatClicked(
        name: String?,
        otherUserId: String?,
        chatsImageUrl: String?,
        chatName: String?
    )
}

interface StatusItemClickListener {
    fun onItemClicked(statusElement: StatusListElement)

}
