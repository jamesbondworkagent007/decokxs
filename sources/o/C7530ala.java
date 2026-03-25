package o;

import com.immomo.mls.fun.ud.view.UDCanvasView;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.ala, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7530ala<U extends UDCanvasView> extends C7816aqv implements InterfaceC7383aim<U> {
    public InterfaceC7383aim.ActionBar KWHzl;
    public U OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    public C7530ala(android.content.Context context, U u) {
        super(context);
        this.OLrzqt = u;
        setViewLifeCycleCallback(u);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7775aqG, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (getUserdata() != null) {
            getUserdata().KWHzl(canvas);
            getUserdata().OLrzqt(canvas);
        }
    }
}
