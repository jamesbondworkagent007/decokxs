package org.luaj.vm2.exception;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class LuaTypeError extends RuntimeException {
    public LuaTypeError() {
    }

    public LuaTypeError(Throwable th) {
        super(th);
    }

    public LuaTypeError(String str) {
        super(str);
    }

    public LuaTypeError(String str, Throwable th) {
        super(str, th);
    }
}
