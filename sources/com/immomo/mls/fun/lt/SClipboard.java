package com.immomo.mls.fun.lt;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7322ahe;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SClipboard {
    public static final String KEY = "Clipboard";
    public Globals globals;
    public ClipboardManager mClipboardManager = (ClipboardManager) EZpvd().getSystemService("clipboard");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.globals = null;
        this.mClipboardManager = null;
    }

    public SClipboard(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public Context EZpvd() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public void setText(String str) {
        if (this.mClipboardManager != null) {
            if (str == null) {
                str = "";
            }
            this.mClipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
        }
    }

    @LuaBridge
    public String getText() {
        ClipData primaryClip;
        CharSequence text;
        ClipboardManager clipboardManager = this.mClipboardManager;
        return (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = this.mClipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) ? "" : text.toString();
    }

    @LuaBridge
    public void setTextWithClipboardName(String str, String str2) {
        ClipData clipDataNewPlainText;
        ClipboardManager clipboardManager = this.mClipboardManager;
        if (clipboardManager != null) {
            if (str == null) {
                str = "";
            }
            if (clipboardManager.hasPrimaryClip()) {
                clipDataNewPlainText = this.mClipboardManager.getPrimaryClip();
                clipDataNewPlainText.addItem(new ClipData.Item(str, str2));
            } else {
                clipDataNewPlainText = ClipData.newPlainText(null, str);
            }
            this.mClipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    @LuaBridge
    public String getTextWithClipboardName(String str) {
        ClipboardManager clipboardManager = this.mClipboardManager;
        if (clipboardManager == null || str == null || !clipboardManager.hasPrimaryClip()) {
            return "";
        }
        ClipData primaryClip = this.mClipboardManager.getPrimaryClip();
        for (int itemCount = primaryClip.getItemCount() - 1; itemCount >= 0; itemCount--) {
            ClipData.Item itemAt = primaryClip.getItemAt(itemCount);
            if (itemAt.getHtmlText() != null && itemAt.getHtmlText().equals(str)) {
                return itemAt.getText().toString();
            }
        }
        return "";
    }
}
