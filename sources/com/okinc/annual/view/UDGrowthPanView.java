package com.okinc.annual.view;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDPoint;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.annual.view.LuaGrowthPanView;
import com.okinc.annual.view.UDGrowthPanView;
import o.C7348aiD;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDGrowthPanView<T extends LuaGrowthPanView> extends UDViewGroup<T> {
    public static final String[] AEQbTJ = {"addPan", "panGestureState", "panGestureTranslationInView", "panGestureVelocityInView", "panLocationInView", "setTranslation", "panEnableBegin"};

    @InterfaceC60044zuT
    public UDGrowthPanView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDGrowthPanView(Globals globals, @NonNull T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDGrowthPanView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        return (T) new LuaGrowthPanView(AubY(), this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addPan(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        final LuaFunction luaFunction = luaValue.toLuaFunction();
        ((LuaGrowthPanView) f_()).setDragListener(new LuaGrowthPanView.Activity() { // from class: o.axZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.annual.view.LuaGrowthPanView.Activity
            public final void KWHzl(LuaGrowthPanView.DragState dragState) {
                UDGrowthPanView.KWHzl(luaFunction, dragState);
            }
        });
        return null;
    }

    public static /* synthetic */ void KWHzl(LuaFunction luaFunction, LuaGrowthPanView.DragState dragState) {
        if (dragState == LuaGrowthPanView.DragState.DOWN) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(1)));
            return;
        }
        if (dragState == LuaGrowthPanView.DragState.MOVE) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(2)));
        } else if (dragState == LuaGrowthPanView.DragState.UP) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(3)));
        } else if (dragState == LuaGrowthPanView.DragState.CANCEL) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(4)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] panGestureState(LuaValue[] luaValueArr) {
        LuaGrowthPanView.DragState currentState = ((LuaGrowthPanView) f_()).getCurrentState();
        if (currentState == LuaGrowthPanView.DragState.DOWN) {
            return LuaValue.varargsOf(LuaValue.varargsOf(LuaNumber.valueOf(1)));
        }
        if (currentState == LuaGrowthPanView.DragState.MOVE) {
            return LuaValue.varargsOf(LuaValue.varargsOf(LuaNumber.valueOf(2)));
        }
        if (currentState == LuaGrowthPanView.DragState.UP) {
            return LuaValue.varargsOf(LuaValue.varargsOf(LuaNumber.valueOf(3)));
        }
        if (currentState == LuaGrowthPanView.DragState.CANCEL) {
            return LuaValue.varargsOf(LuaValue.varargsOf(LuaNumber.valueOf(4)));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] panGestureTranslationInView(LuaValue[] luaValueArr) {
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl(((LuaGrowthPanView) f_()).getDeltaX());
        c7348aiD.AEQbTJ(((LuaGrowthPanView) f_()).getDeltaY());
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] panGestureVelocityInView(LuaValue[] luaValueArr) {
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl(((LuaGrowthPanView) f_()).getVelocityX());
        c7348aiD.AEQbTJ(((LuaGrowthPanView) f_()).getVelocityY());
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] panLocationInView(LuaValue[] luaValueArr) {
        C7348aiD c7348aiD = new C7348aiD();
        c7348aiD.KWHzl(((LuaGrowthPanView) f_()).getCurrentX());
        c7348aiD.AEQbTJ(((LuaGrowthPanView) f_()).getCurrentY());
        return LuaValue.varargsOf(new UDPoint(getGlobals(), c7348aiD));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setTranslation(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        ((LuaGrowthPanView) f_()).setTranslation((UDPoint) luaValueArr[0]);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] panEnableBegin(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        ((LuaGrowthPanView) f_()).panEnableBegin(luaValueArr[0].toBoolean());
        return null;
    }
}
