package com.immomo.mls.fun.ud.view;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDZoomImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.C7323ahf;
import o.InterfaceC60044zuT;
import o.InterfaceC7855arh;
import o.ScaleGestureDetectorOnScaleGestureListenerC7495aks;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDZoomImageView<U extends ScaleGestureDetectorOnScaleGestureListenerC7495aks> extends UDView<U> {
    public static final String[] EZpvd = {"setImageUrl", "onLongPress", "onSingleTap"};
    public ScaleGestureDetectorOnScaleGestureListenerC7495aks KWHzl;
    public InterfaceC7855arh OLrzqt;

    public UDZoomImageView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks = new ScaleGestureDetectorOnScaleGestureListenerC7495aks(AubY());
        this.KWHzl = scaleGestureDetectorOnScaleGestureListenerC7495aks;
        scaleGestureDetectorOnScaleGestureListenerC7495aks.setScaleRange(1.0f, luaValueArr[0].toFloat());
        this.OLrzqt = C7323ahf.AYXKKw();
        return (U) this.KWHzl;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImageUrl(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            String javaString = luaValueArr[0].toJavaString();
            UDImageInfo uDImageInfo = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDImageInfo) luaValueArr[1];
            this.OLrzqt.EZpvd(AubY(), this.KWHzl, javaString, null, uDImageInfo != null ? uDImageInfo.EZpvd() : null, null, null);
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onLongPress(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.KWHzl.setOnLongPressListener(new Function0() { // from class: o.akv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDZoomImageView.EZpvd(luaFunction);
            }
        });
        return super.onLongPress(luaValueArr);
    }

    public static /* synthetic */ Unit EZpvd(LuaFunction luaFunction) {
        if (luaFunction == null) {
            return null;
        }
        luaFunction.OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onSingleTap(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.KWHzl.setOnSingleTapListener(new Function0() { // from class: o.aku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDZoomImageView.KWHzl(luaFunction);
            }
        });
        return null;
    }

    public static /* synthetic */ Unit KWHzl(LuaFunction luaFunction) {
        if (luaFunction == null) {
            return null;
        }
        luaFunction.OLrzqt();
        return null;
    }
}
