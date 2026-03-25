package com.immomo.mls.fun.ud;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDCCanvas extends LuaUserdata<Canvas> {
    public static native void _init();

    public static native void _register(long j, String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.Canvas */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(Canvas canvas) {
        this.javaUserdata = canvas;
    }

    @InterfaceC60044zuT
    public UDCCanvas(long j) {
        super(j, (LuaValue[]) null);
    }

    @InterfaceC60044zuT
    public UDCCanvas(@NonNull Globals globals, Canvas canvas) {
        super(globals, canvas);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public int save() {
        T t = this.javaUserdata;
        if (t != 0) {
            return ((Canvas) t).save();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void restore() {
        T t = this.javaUserdata;
        if (t != 0) {
            ((Canvas) t).restore();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void restoreToCount(int i) {
        T t = this.javaUserdata;
        if (t != 0) {
            ((Canvas) t).restoreToCount(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void translate(double d, double d2) {
        if (this.javaUserdata == 0) {
            return;
        }
        ((Canvas) this.javaUserdata).translate(C7865arr.copydefault(d), C7865arr.copydefault(d2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void clipRect(double d, double d2, double d3, double d4) {
        T t = this.javaUserdata;
        if (t == 0) {
            return;
        }
        ((Canvas) t).clipRect(C7865arr.copydefault(d), C7865arr.copydefault(d2), C7865arr.copydefault(d3), C7865arr.copydefault(d4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void clipPath(UDPath uDPath) {
        T t = this.javaUserdata;
        if (t == 0) {
            return;
        }
        ((Canvas) t).clipPath(uDPath.getJavaUserdata());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void drawColor(int i) {
        T t = this.javaUserdata;
        if (t == 0) {
            return;
        }
        ((Canvas) t).drawColor(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public void drawRect(double d, double d2, double d3, double d4, UDPaint uDPaint) {
        T t = this.javaUserdata;
        if (t == 0) {
            return;
        }
        ((Canvas) t).drawRect(C7865arr.copydefault(d), C7865arr.copydefault(d2), C7865arr.copydefault(d3), C7865arr.copydefault(d4), uDPaint.getJavaUserdata());
    }
}
