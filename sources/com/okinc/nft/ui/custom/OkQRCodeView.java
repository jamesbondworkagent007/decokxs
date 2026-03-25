package com.okinc.nft.ui.custom;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.immomo.mls.fun.ud.view.UDView;
import o.AbstractC5454Si;
import o.C6995aZr;
import o.InterfaceC5460So;
import o.InterfaceC60044zuT;
import o.InterfaceC7405ajH;
import o.InterfaceC9742bbN;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public class OkQRCodeView<U extends C6995aZr> extends UDView<U> {
    public static final String[] AEQbTJ = {"setContent", "setLogo", "setCoin"};
    public static final String EZpvd = OkQRCodeView.class.getSimpleName();
    public InterfaceC7405ajH OLrzqt;
    public C6995aZr copydefault;

    @InterfaceC60044zuT
    public OkQRCodeView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        U u = (U) new C6995aZr(AubY());
        this.copydefault = u;
        return u;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContent(LuaValue[] luaValueArr) {
        f_().setContent(luaValueArr[0].toJavaString(), false, 0.0f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCoin(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaUserdata)) {
            return null;
        }
        LuaUserdata luaUserdata = (LuaUserdata) luaValue;
        if (!(luaUserdata.getJavaUserdata() instanceof InterfaceC9742bbN)) {
            return null;
        }
        f_().setContent(((InterfaceC9742bbN) luaUserdata.getJavaUserdata()).djBIcL(), false, 0.0f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLogo(LuaValue[] luaValueArr) {
        Glide.AEQbTJ(AubY()).AEQbTJ().copydefault(luaValueArr[0].toJavaString()).OLrzqt(new AbstractC5454Si<Drawable>() { // from class: com.okinc.nft.ui.custom.OkQRCodeView.1
            @Override // o.InterfaceC5462Sq
            public /* bridge */ /* synthetic */ void copydefault(@NonNull Object obj, @Nullable InterfaceC5460So interfaceC5460So) {
                copydefault((Drawable) obj, (InterfaceC5460So<? super Drawable>) interfaceC5460So);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: U */
            /* JADX WARN: Multi-variable type inference failed */
            public void copydefault(@NonNull Drawable drawable, @Nullable InterfaceC5460So<? super Drawable> interfaceC5460So) {
                if (drawable instanceof BitmapDrawable) {
                    ((C6995aZr) OkQRCodeView.this.f_()).setLogoBitmap(((BitmapDrawable) drawable).getBitmap(), r7.getBitmap().getWidth(), r7.getBitmap().getHeight());
                }
            }
        });
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        this.OLrzqt = null;
        super.AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        InterfaceC7405ajH interfaceC7405ajH = new InterfaceC7405ajH() { // from class: com.okinc.nft.ui.custom.OkQRCodeView.2
            @Override // o.InterfaceC7405ajH
            public void EZpvd() {
            }
        };
        this.OLrzqt = interfaceC7405ajH;
        KWHzl(interfaceC7405ajH);
        super.copydefault();
    }
}
