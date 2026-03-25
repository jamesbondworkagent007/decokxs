package com.immomo.mls.fun.ud.view;

import android.graphics.Canvas;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.View;
import com.immomo.mls.fun.ud.UDCCanvas;
import com.immomo.mls.fun.ud.UDPaint;
import java.util.Iterator;
import o.C7320ahc;
import o.C7546alq;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDLuaViewRoot extends UDViewGroup<C7546alq> {
    public static final String[] KWHzl = {"closeHardWare", "setOnTouchListener", "doInNextFrame", "doAfter", "removeTask", "invalidate"};
    public LuaValue AEQbTJ;
    public boolean AYXKKw;
    public final ArrayMap<String, Runnable> EZpvd;
    public View.OnTouchListener OLrzqt;
    public LuaFunction copydefault;
    public UDCCanvas gEmmrt;
    public LuaValue valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public UDLuaViewRoot(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AYXKKw = false;
        this.OLrzqt = new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.view.UDLuaViewRoot.1
            public LuaTable EZpvd;
            public int copydefault = 1;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.EZpvd == null) {
                    this.EZpvd = LuaTable.AEQbTJ(UDLuaViewRoot.this.globals);
                }
                copydefault(this.EZpvd, motionEvent);
                LuaValue[] luaValueArrInvoke = UDLuaViewRoot.this.copydefault.invoke(LuaValue.varargsOf(this.EZpvd, UDLuaViewRoot.this.valueOf));
                return luaValueArrInvoke != null && luaValueArrInvoke.length > 0 && luaValueArrInvoke[0].toBoolean();
            }

            public final void copydefault(LuaTable luaTable, MotionEvent motionEvent) {
                luaTable.set(3, motionEvent.getActionMasked());
                luaTable.set(4, C7865arr.AEQbTJ(motionEvent.getRawX()));
                luaTable.set(5, C7865arr.AEQbTJ(motionEvent.getRawY()));
                luaTable.set(7, motionEvent.getActionIndex());
                luaTable.set(8, motionEvent.getEventTime());
                int pointerCount = motionEvent.getPointerCount();
                int i = this.copydefault;
                if (pointerCount > i) {
                    i = pointerCount;
                }
                this.copydefault = i;
                luaTable.set(6, pointerCount);
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    int i3 = i2 + 11;
                    LuaValue luaValueAEQbTJ = luaTable.get(i3);
                    if (luaValueAEQbTJ.isNil()) {
                        luaValueAEQbTJ = LuaTable.AEQbTJ(UDLuaViewRoot.this.globals);
                        luaTable.set(i3, luaValueAEQbTJ);
                    }
                    luaValueAEQbTJ.set(0, C7865arr.AEQbTJ(motionEvent.getX(i2)));
                    luaValueAEQbTJ.set(1, C7865arr.AEQbTJ(motionEvent.getY(i2)));
                    luaValueAEQbTJ.set(2, motionEvent.getPointerId(i2));
                }
            }
        };
        this.EZpvd = new ArrayMap<>();
        ((C7546alq) this.javaUserdata).setWillNotDraw(false);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7546alq AEQbTJ(LuaValue[] luaValueArr) {
        return new C7546alq<UDLuaViewRoot>(AubY(), this) { // from class: com.immomo.mls.fun.ud.view.UDLuaViewRoot.4
            @Override // android.view.View
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                UDLuaViewRoot.this.KWHzl(canvas);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View] */
    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        super.__onLuaGc();
        ?? F_ = f_();
        if (F_ == 0) {
            return;
        }
        Iterator<Runnable> it = this.EZpvd.values().iterator();
        while (it.hasNext()) {
            F_.removeCallbacks(it.next());
        }
        this.EZpvd.clear();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] refresh(LuaValue[] luaValueArr) {
        ((C7546alq) this.dHguZz).invalidate();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] invalidate(LuaValue[] luaValueArr) {
        LuaValue.destroyAllParams(luaValueArr);
        ((C7546alq) this.dHguZz).invalidate();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] closeHardWare(LuaValue[] luaValueArr) {
        UDPaint uDPaint = (luaValueArr.length <= 0 || !luaValueArr[0].isUserdata()) ? null : (UDPaint) luaValueArr[0].toUserdata();
        ((C7546alq) f_()).setLayerType(1, (uDPaint == null || uDPaint.getJavaUserdata() == null) ? null : uDPaint.getJavaUserdata());
        if (uDPaint != null) {
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    private LuaValue[] setOnTouchListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.copydefault;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = this.valueOf;
        if (luaValue != null) {
            luaValue.destroy();
        }
        this.copydefault = luaValueArr[0].toLuaFunction();
        this.valueOf = luaValueArr[1];
        if (this.AYXKKw) {
            return null;
        }
        ((C7546alq) f_()).setOnTouchListener(this.OLrzqt);
        this.AYXKKw = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    private LuaValue[] doInNextFrame(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        final LuaValue[] luaValueArrSub = LuaValue.sub(luaValueArr, 1);
        ((C7546alq) f_()).post(new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDLuaViewRoot.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    luaFunction.invoke(luaValueArrSub);
                } catch (InvokeError e) {
                    if (!C7320ahc.AEQbTJ(e, UDLuaViewRoot.this.globals)) {
                        throw e;
                    }
                }
                luaFunction.destroy();
                LuaValue[] luaValueArr2 = luaValueArrSub;
                if (luaValueArr2 != null) {
                    LuaValue.destroyAllParams(luaValueArr2);
                }
            }
        });
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    private LuaValue[] doAfter(LuaValue[] luaValueArr) {
        final String javaString = luaValueArr[0].toJavaString();
        final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        long j = (long) (luaValueArr[2].toDouble() * 1000.0d);
        final LuaValue[] luaValueArrSub = LuaValue.sub(luaValueArr, 3);
        Runnable runnable = new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDLuaViewRoot.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    luaFunction.invoke(luaValueArrSub);
                } catch (InvokeError e) {
                    if (!C7320ahc.AEQbTJ(e, UDLuaViewRoot.this.globals)) {
                        throw e;
                    }
                }
                luaFunction.destroy();
                LuaValue[] luaValueArr2 = luaValueArrSub;
                if (luaValueArr2 != null) {
                    LuaValue.destroyAllParams(luaValueArr2);
                }
                UDLuaViewRoot.this.EZpvd.remove(javaString);
            }
        };
        this.EZpvd.put(javaString, runnable);
        ((C7546alq) f_()).postDelayed(runnable, j);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    private LuaValue[] removeTask(LuaValue[] luaValueArr) {
        Runnable runnableRemove = this.EZpvd.remove(luaValueArr[0].toJavaString());
        if (runnableRemove == null) {
            return null;
        }
        ((C7546alq) f_()).removeCallbacks(runnableRemove);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onDraw(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr.length > 1 ? luaValueArr[1] : null;
        return super.onDraw(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.StateListAnimator
    public void KWHzl(Canvas canvas) {
        if (this.DXXBbs != null) {
            if (this.gEmmrt == null) {
                UDCCanvas uDCCanvas = new UDCCanvas(getGlobals(), canvas);
                this.gEmmrt = uDCCanvas;
                uDCCanvas.onJavaRef();
            }
            this.gEmmrt.OLrzqt(canvas);
            int iSave = canvas.save();
            LuaValue luaValue = this.AEQbTJ;
            if (luaValue != null) {
                this.DXXBbs.invoke(LuaValue.varargsOf(this.gEmmrt, luaValue));
            } else {
                this.DXXBbs.invoke(LuaValue.varargsOf(this.gEmmrt));
            }
            canvas.restoreToCount(iSave);
        }
    }
}
