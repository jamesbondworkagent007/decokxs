package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27581jxr {
    public static final java.lang.CharSequence KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    /* JADX INFO: renamed from: o.jxr$StateListAnimator */
    public static final class StateListAnimator implements Function1<JsonBuilder, Unit> {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            OLrzqt(jsonBuilder);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(JsonBuilder jsonBuilder) {
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
            jsonBuilder.setLenient(true);
            jsonBuilder.setCoerceInputValues(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.serialization.json.JsonElement */
    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement copydefault(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (jsonElement instanceof JsonObject) {
            java.util.Map mapValues = C56424yEw.values((java.util.Map) jsonElement);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapValues.size()));
            for (Map.Entry entry : mapValues.entrySet()) {
                linkedHashMap.put(entry.getKey(), copydefault((JsonElement) entry.getValue()));
            }
            return new JsonObject(linkedHashMap);
        }
        if (!(jsonElement instanceof JsonArray)) {
            return jsonElement;
        }
        if (((JsonArray) jsonElement).isEmpty()) {
            return JsonNull.INSTANCE;
        }
        java.lang.Iterable iterable = (java.lang.Iterable) jsonElement;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((JsonElement) it.next()));
        }
        return new JsonArray(arrayList);
    }

    public static final java.lang.String EZpvd(@NotNull java.util.List<InvestTokenWithAmount> list, @NotNull java.util.List<InvestTokenWithAmount> list2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
            java.util.Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(investTokenWithAmount.getTokenAddress(), ((InvestTokenWithAmount) next).getTokenAddress(), true)) {
                    break;
                }
            }
            if (next == null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C27581jxr.KWHzl((InvestTokenWithAmount) obj2);
            }
        }, 30, null);
    }
}
