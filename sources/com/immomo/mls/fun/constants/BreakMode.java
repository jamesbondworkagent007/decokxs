package com.immomo.mls.fun.constants;

import android.text.TextUtils;
import o.InterfaceC7952atY;
import o.InterfaceC8007aub;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7952atY
public interface BreakMode {

    @InterfaceC8007aub
    public static final int CLIPPING = -1;

    @InterfaceC8007aub
    public static final int HEAD = TextUtils.TruncateAt.START.ordinal();

    @InterfaceC8007aub
    public static final int TAIL = TextUtils.TruncateAt.END.ordinal();

    @InterfaceC8007aub
    public static final int MIDDLE = TextUtils.TruncateAt.MIDDLE.ordinal();
}
