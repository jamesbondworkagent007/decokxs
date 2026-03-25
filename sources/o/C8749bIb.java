package o;

import com.okinc.business.defi.api.bean.AptosSignType;
import com.okinc.business.defi.api.model.tx.signdata.AptosContractSignData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.aptos.AptosPayloadTransaction;
import com.okinc.wallet.core.sign.aptos.AptosRawTransaction;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8749bIb extends AbstractC12442cmy {
    public final C8701bHg<?> copydefault;

    /* JADX INFO: renamed from: o.bIb$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AptosSignType.values().length];
            try {
                iArr[AptosSignType.SIGN_PAYLOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AptosSignType.SIGN_SCRIPT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AptosSignType.SIGN_RAW_SIMPLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AptosSignType.SIGN_RAW_MULTI_AGENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8749bIb(@NotNull C8701bHg<?> c8701bHg) {
        super(c8701bHg);
        Intrinsics.checkNotNullParameter(c8701bHg, "");
        this.copydefault = c8701bHg;
    }

    public final SignedTx OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = Application.AEQbTJ[this.copydefault.RcXXUw().ordinal()];
        if (i == 1) {
            return xYX.copydefault.EZpvd(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), copydefault());
        }
        if (i == 2) {
            return xYX.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), copydefault());
        }
        if (i == 3) {
            xYX xyx = xYX.copydefault;
            SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null);
            java.lang.String payload = ((AptosContractSignData) this.copydefault.QVsKAR()).getPayload();
            return xyx.AEQbTJ(signParamsGenerateSignParams$default, new AptosRawTransaction(payload != null ? payload : ""));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        xYX xyx2 = xYX.copydefault;
        SignParams signParamsGenerateSignParams$default2 = AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null);
        java.lang.String payload2 = ((AptosContractSignData) this.copydefault.QVsKAR()).getPayload();
        return xyx2.OLrzqt(signParamsGenerateSignParams$default2, new AptosRawTransaction(payload2 != null ? payload2 : ""));
    }

    public final java.lang.String AEQbTJ() {
        SignParams signParams = new SignParams(this.copydefault.dHguZz().QKVWgx(), this.copydefault.dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, false, null, 1788, null);
        int i = Application.AEQbTJ[this.copydefault.RcXXUw().ordinal()];
        if (i == 1) {
            xYX xyx = xYX.copydefault;
            AptosPayloadTransaction aptosPayloadTransactionCopydefault = copydefault();
            aptosPayloadTransactionCopydefault.setPublicKey(this.copydefault.fERRXa().getPublicKey());
            Unit unit = Unit.INSTANCE;
            return xyx.copydefault(signParams, aptosPayloadTransactionCopydefault);
        }
        if (i == 2) {
            xYX xyx2 = xYX.copydefault;
            AptosPayloadTransaction aptosPayloadTransactionCopydefault2 = copydefault();
            aptosPayloadTransactionCopydefault2.setPublicKey(this.copydefault.fERRXa().getPublicKey());
            Unit unit2 = Unit.INSTANCE;
            return xyx2.KWHzl(signParams, aptosPayloadTransactionCopydefault2);
        }
        java.lang.String payload = ((AptosContractSignData) this.copydefault.QVsKAR()).getPayload();
        return payload == null ? "" : payload;
    }

    public final AptosPayloadTransaction copydefault() {
        java.lang.String address = this.copydefault.fERRXa().getAddress();
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.copydefault.zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.copydefault.aKErDB().getSequenceNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(this.copydefault.copydefault(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(this.copydefault.OLrzqt(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String expirationTimestampSecs = this.copydefault.aKErDB().getExpirationTimestampSecs();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(this.copydefault.aKErDB().getChainId(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String payload = ((AptosContractSignData) this.copydefault.QVsKAR()).getPayload();
        java.lang.String str = payload == null ? "" : payload;
        java.lang.String abi = ((AptosContractSignData) this.copydefault.QVsKAR()).getAbi();
        return new AptosPayloadTransaction(address, strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, expirationTimestampSecs, strConvertToBigIntegerString$default5, str, abi == null ? "" : abi, (java.lang.String) null, ((AptosContractSignData) this.copydefault.QVsKAR()).isRawType(), 1024, (DefaultConstructorMarker) null);
    }
}
