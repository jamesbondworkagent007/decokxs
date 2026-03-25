package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem;
import com.okinc.wallet.core.decode.PsbtDecodeItem;
import com.okinc.wallet.core.decode.PsbtDecodeItemDetails;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC10347bmj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10798bvJ {
    public final Json OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final java.util.Set<java.lang.String> EZpvd = yEE.AhwBna("btc_psbt", "btc_psbts");

    public C10798bvJ(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        this.OLrzqt = json;
    }

    /* JADX DEBUG: Type inference failed for r0v12. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<o.bvS> */
    public final AbstractC58185ywX<C10807bvS> EZpvd(@NotNull C10804bvP c10804bvP, int i, @NotNull final java.lang.String str) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c10804bvP, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) EZpvd), c10804bvP.AEQbTJ())) {
            AbstractC58185ywX<C10807bvS> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new C10807bvS(i, str));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.lang.String strAEQbTJ = c10804bvP.AEQbTJ();
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || (strKWHzl = c10804bvP.KWHzl()) == null || strKWHzl.length() == 0 || c10804bvP.EZpvd() == null) {
            AbstractC58185ywX<C10807bvS> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new C10807bvS(-5000, str));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        java.util.List<java.lang.String> listOLrzqt = OLrzqt(c10804bvP.OLrzqt(), c10804bvP.AEQbTJ());
        if (listOLrzqt.isEmpty()) {
            AbstractC58185ywX<C10807bvS> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new C10807bvS(i, str));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        java.util.List<PsbtDecodeItem> listKWHzl = C54904xZq.copydefault.KWHzl(listOLrzqt);
        java.util.ArrayList<PsbtDecodeItemDetails> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((PsbtDecodeItem) it.next()).copydefault());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (PsbtDecodeItemDetails psbtDecodeItemDetails : arrayList) {
            arrayList2.add(new InvestUtxoConfirmationItem(psbtDecodeItemDetails.getTxnId(), psbtDecodeItemDetails.getVout(), (java.lang.Integer) null, true, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, (DefaultConstructorMarker) null));
        }
        C10314bmC c10314bmC = new C10314bmC(c10804bvP.KWHzl(), c10804bvP.EZpvd().longValue(), arrayList2, false, null, UtxoConfirmationContext.Dapp);
        C10350bmm c10350bmm = C10350bmm.AEQbTJ;
        android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        AbstractC58185ywX<AbstractC10347bmj> abstractC58185ywXEZpvd = c10350bmm.EZpvd(applicationContext, c10314bmC, null);
        final Function1 function1 = new Function1() { // from class: o.bvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10798bvJ.OLrzqt(str, (AbstractC10347bmj) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10798bvJ.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final C10807bvS EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10807bvS) function1.invoke(obj);
    }

    public static final C10807bvS OLrzqt(java.lang.String str, AbstractC10347bmj abstractC10347bmj) {
        int i;
        Intrinsics.checkNotNullParameter(abstractC10347bmj, "");
        if (Intrinsics.EZpvd(abstractC10347bmj, AbstractC10347bmj.Application.KWHzl) || Intrinsics.EZpvd(abstractC10347bmj, AbstractC10347bmj.TaskDescription.copydefault)) {
            i = -5001;
        } else {
            i = Intrinsics.EZpvd(abstractC10347bmj, AbstractC10347bmj.ActionBar.copydefault) ? -5014 : -5000;
        }
        return new C10807bvS(i, str);
    }

    public final java.util.List<java.lang.String> OLrzqt(java.lang.String str, java.lang.String str2) {
        JsonElement jsonElement;
        JsonArray jsonArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        JsonObject jsonObject = JsonElementKt.getJsonObject(this.OLrzqt.parseToJsonElement(str));
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "btc_psbt")) {
            arrayList.add(JsonElementKt.getJsonPrimitive((JsonElement) C56424yEw.EZpvd((java.util.Map<java.lang.String, ? extends V>) ((java.util.Map<java.lang.Object, ? extends V>) jsonObject), "psbtHex")).getContent());
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "btc_psbts") && (jsonElement = (JsonElement) jsonObject.get((java.lang.Object) "psbtHexs")) != null && (jsonArray = JsonElementKt.getJsonArray(jsonElement)) != null) {
            java.util.Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(JsonElementKt.getJsonPrimitive(it.next()).getContent());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.bvJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bvJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
