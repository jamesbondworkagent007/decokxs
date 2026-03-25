package com.geetest.captcha;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public enum i {
    WEB_VIEW_NEW("0"),
    PARAM("1"),
    WEB_VIEW_HTTP("2"),
    WEB_VIEW_SSL("3"),
    USER_ERROR("4"),
    WEB_CALLBACK_ERROR("5"),
    NET(OrderDetailListItem.SLIP_OUT);

    private String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    i(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }
}
