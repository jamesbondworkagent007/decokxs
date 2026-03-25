package com.immomo.mls.fun.ud.net;

import o.InterfaceC7952atY;
import o.InterfaceC8007aub;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7952atY
public interface CachePolicy {

    @InterfaceC8007aub
    public static final int API_ONLY = 0;

    @InterfaceC8007aub
    public static final int CACHE_ONLY = 3;

    @InterfaceC8007aub
    public static final int CACHE_OR_API = 2;

    @InterfaceC8007aub
    public static final int CACHE_THEN_API = 1;

    @InterfaceC8007aub
    public static final int REFRESH_CACHE_BY_API = 4;
}
