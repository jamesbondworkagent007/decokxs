package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28180kRw {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C28196kSl AEQbTJ;
    public final kQA EZpvd;
    public final C23212htv copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23212htv OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public C28180kRw(@NotNull kQA kqa, @NotNull C23212htv c23212htv, @NotNull C28196kSl c28196kSl) {
        Intrinsics.checkNotNullParameter(kqa, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        this.EZpvd = kqa;
        this.copydefault = c23212htv;
        this.AEQbTJ = c28196kSl;
    }

    /* JADX INFO: renamed from: o.kRw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kRw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final AbstractC58185ywX<ResponseData<C9748bbT>> KWHzl(InterfaceC9734bbF interfaceC9734bbF, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) throws OKServerException {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        InterfaceC9740bbL interfaceC9740bbLOLrzqt = this.AEQbTJ.OLrzqt();
        if (interfaceC9734bbF == null) {
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), null, null, 13, null);
        }
        java.lang.CharSequence charSequenceCopydefault = interfaceC9740bbLOLrzqt.copydefault(fragmentActivity, interfaceC9734bbF.valueOf(), interfaceC9734bbF);
        java.lang.CharSequence charSequence = charSequenceCopydefault != null ? charSequenceCopydefault : "";
        if (Intrinsics.EZpvd(interfaceC9734bbF.valueOf(), C9863bdc.EZpvd)) {
            AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXEZpvd = interfaceC9740bbLOLrzqt.copydefault(fragmentActivity, interfaceC9734bbF, taskDescription, z).EZpvd();
            Intrinsics.copydefault(abstractC58185ywXEZpvd);
            return abstractC58185ywXEZpvd;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, charSequence.toString(), null, null, 13, null));
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Type inference failed for r9v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXEZpvd = this.EZpvd.EZpvd(str, str2, str3, str4, TradeMode.AdvancedMode.getType(), i);
        final Function1 function1 = new Function1() { // from class: o.kRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28180kRw.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28180kRw.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(ResponseData responseData) throws OKServerException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SaveIntentData saveIntentData = (SaveIntentData) responseData.getData();
            java.lang.String orderId = saveIntentData != null ? saveIntentData.getOrderId() : null;
            return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, orderId == null ? "" : orderId, null, 44, null);
        }
        throw new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null);
    }
}
