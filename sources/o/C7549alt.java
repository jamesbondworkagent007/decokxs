package o;

import com.immomo.mls.fun.ud.view.UDTabLayout;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.alt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7549alt extends C7812aqr implements InterfaceC7383aim<UDTabLayout> {
    public InterfaceC7383aim.ActionBar AEQbTJ;
    public final UDTabLayout EZpvd;
    public C7978aty KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7978aty KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UDTabLayout getUserdata() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    public C7549alt(android.content.Context context, UDTabLayout uDTabLayout, LuaValue[] luaValueArr) {
        super(context);
        this.EZpvd = uDTabLayout;
        this.KWHzl = new C7978aty(context);
        setViewLifeCycleCallback(uDTabLayout);
        addView(this.KWHzl, C7823arB.KWHzl());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }
}
