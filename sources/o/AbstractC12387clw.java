package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12387clw<SignData extends UTXOTransferSignData> extends AbstractC11993ceZ<SignData> {
    public final java.lang.String dNCPSb = "OKWUTXOBaseTransfer";

    public abstract java.lang.String DGgnkA();

    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        OLrzqt(this.dNCPSb, "init: " + signDataArgs);
        return zKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.Integer dvKsVJ() {
        return fHqPtx().QbewEr();
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        OLrzqt(this.dNCPSb, "onSetTransferAmount");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(new RefreshUTXOVenue(false, false, false, false, true, false, false, false, 0, 495, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.clC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12387clw.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12387clw.hCLrkq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(AbstractC12387clw abstractC12387clw, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            abstractC12387clw.DXXBbs().KWHzl(2);
        }
        return pair;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        DLWbHP().AEQbTJ(new C9813bcf(DNMMPQ(), getMinOutput$OKWallet_wallet_impl$default(this, false, false, 3, null)));
    }

    private final boolean DNMMPQ() {
        if (fHqPtx().OxVOHk()) {
            return C33129mqd.copydefault(DGgnkA(), getMinOutput$OKWallet_wallet_impl$default(this, false, false, 3, null));
        }
        return true;
    }

    public static /* synthetic */ java.lang.String getMinOutput$OKWallet_wallet_impl$default(AbstractC12387clw abstractC12387clw, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMinOutput");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return abstractC12387clw.EZpvd(z, z2);
    }

    public final java.lang.String EZpvd(boolean z, boolean z2) {
        java.lang.String minOutput;
        java.lang.String minOutput2;
        if (z) {
            UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
            if (uTXOSignInfoUeEOUB != null && (minOutput2 = uTXOSignInfoUeEOUB.getMinOutput()) != null) {
                java.lang.String strEZpvd = C54870xYj.EZpvd(minOutput2, dHguZz().valueOf(), dHguZz().AkhnZx(), z2 ? dHguZz().fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
            }
            return "";
        }
        UTXOSignInfo uTXOSignInfoUeEOUB2 = UeEOUB();
        return (uTXOSignInfoUeEOUB2 == null || (minOutput = uTXOSignInfoUeEOUB2.getMinOutput()) == null) ? "0" : minOutput;
    }

    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), responseData.getData(), DGOPHZ(), C33129mqd.AhwBna(l_()), fHqPtx().DbNXlk(), null, false, null, 448, null);
    }
}
