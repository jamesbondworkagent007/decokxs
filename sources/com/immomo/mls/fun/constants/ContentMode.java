package com.immomo.mls.fun.constants;

import android.widget.ImageView;
import o.InterfaceC7952atY;
import o.InterfaceC8007aub;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7952atY
public interface ContentMode {

    @InterfaceC8007aub
    public static final int SCALE_TO_FILL = ImageView.ScaleType.FIT_XY.ordinal();

    @InterfaceC8007aub
    public static final int SCALE_ASPECT_FIT = ImageView.ScaleType.FIT_CENTER.ordinal();

    @InterfaceC8007aub
    public static final int SCALE_ASPECT_FILL = ImageView.ScaleType.CENTER_CROP.ordinal();

    @InterfaceC8007aub
    public static final int CENTER = ImageView.ScaleType.CENTER.ordinal();
}
