package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hNK extends C24795ika {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hNK(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:28) call: o.hNK.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ hNK(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hNK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setActionCallBack(@NotNull final C22495hgT c22495hgT, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        hGZ hgzEZpvd = EZpvd();
        if (hgzEZpvd != null) {
            hgzEZpvd.KWHzl.setActionCallBack(new Function0() { // from class: o.hNJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hNK.EZpvd(function0, c22495hgT, this, function02);
                }
            });
        }
    }

    public static final Unit EZpvd(Function0 function0, C22495hgT c22495hgT, hNK hnk, Function0 function02) {
        function0.invoke();
        if (c22495hgT.QCjLjM()) {
            C25352ivB.startVibrator$default(0L, 1, null);
            hnk.OLrzqt(c22495hgT, function02);
            C32866mlf.onEvent$default("DexSwapLimit_Full_Balance_Click", (TrackChannel[]) null, new Function1() { // from class: o.hNM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hNK.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            c22495hgT.AEQbTJ("max");
        } else {
            C55326xho.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.zCTncp));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "balance_bracket", "max", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull C22495hgT c22495hgT, @NotNull Function0<Unit> function0) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String strSubCheckS$default = (java.lang.String) copydefault().getFromData().getHorizontalLabelData().getCacheData();
        if (strSubCheckS$default != null) {
            if (c22495hgT.OJuSTm()) {
                strSubCheckS$default = C23313hvq.subCheckS$default(strSubCheckS$default, c22495hgT.hDKMBd(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                if (C23313hvq.OLrzqt(strSubCheckS$default, 0)) {
                    if (!C23317hvu.values()) {
                        function0.invoke();
                    }
                    setShowContent(C23311hvo.OLrzqt(strSubCheckS$default, "12"));
                } else if (C23313hvq.KWHzl(strSubCheckS$default, 0)) {
                    setShowContent("0");
                    strSubCheckS$default = "0";
                } else {
                    strSubCheckS$default = MultiTransferSignData.DEFAULT_INTERVAL;
                }
            } else {
                setShowContent(C23311hvo.OLrzqt(strSubCheckS$default, "12"));
            }
            ConsumeData<TradeInputGroup> value = c22495hgT.getPostValueLengthLimit().getValue();
            if (C23313hvq.AhwBna((value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null) ? null : editData.getData(), strSubCheckS$default) || C23313hvq.copydefault(strSubCheckS$default, "0")) {
                c22495hgT.AEQbTJ(ChangeType.FromChange);
                c22495hgT.KWHzl(AhwBna(), strSubCheckS$default);
            }
        }
    }
}
