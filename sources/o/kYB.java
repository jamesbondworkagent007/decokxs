package o;

import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kYB implements kYC {
    @yCM
    public kYB() {
    }

    @Override // o.kYC
    public InterfaceC9738bbJ copydefault() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
    }

    @Override // o.kYC
    public java.lang.String KWHzl() {
        java.lang.String strDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = copydefault();
        return (interfaceC9738bbJCopydefault == null || (strDbNXlk = interfaceC9738bbJCopydefault.DbNXlk()) == null) ? "" : strDbNXlk;
    }

    @Override // o.kYC
    public java.lang.String OLrzqt() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).djBIcL();
    }

    @Override // o.kYC
    public AbstractC58185ywX<C9860bdZ> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class)).i_(str);
    }

    @Override // o.kYC
    public java.lang.String OLrzqt(long j) {
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = copydefault();
        java.lang.String strEZpvd = interfaceC9738bbJCopydefault != null ? interfaceC9738bbJCopydefault.EZpvd(j) : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    @Override // o.kYC
    public OKWalletHiddenSmallAssetTokenModel AEQbTJ() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).OLrzqt();
    }

    @Override // o.kYC
    public AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> EZpvd() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AEQbTJ(KWHzl());
    }
}
