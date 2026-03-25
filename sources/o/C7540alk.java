package o;

import com.immomo.mls.fun.ud.view.UDSwitch;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.alk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7540alk extends android.widget.Switch implements InterfaceC7383aim<UDSwitch> {
    public InterfaceC7383aim.ActionBar AEQbTJ;
    public UDSwitch OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public UDSwitch getUserdata() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    public C7540alk(android.content.Context context, UDSwitch uDSwitch, LuaValue[] luaValueArr) {
        super(context);
        this.OLrzqt = uDSwitch;
        setViewLifeCycleCallback(uDSwitch);
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }
}
