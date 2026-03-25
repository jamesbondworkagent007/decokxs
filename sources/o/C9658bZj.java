package o;

import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import com.okinc.wallet.core.sign.solana.GenerateRawTransactionBean;
import com.okinc.wallet.core.sign.solana.MultiUnitPriceAndLimit;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.bZj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9658bZj extends AbstractC9595bYZ {
    public final C9475bWL AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9658bZj(@NotNull C9475bWL c9475bWL) {
        super(c9475bWL);
        Intrinsics.checkNotNullParameter(c9475bWL, "");
        this.AEQbTJ = c9475bWL;
    }

    public final void gEmmrt(@NotNull java.util.List<? extends JSONArray> list, @NotNull final Function1<? super java.util.List<SolanaTxResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.EZpvd(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9658bZj.KWHzl(this.copydefault, function1, (java.lang.String) obj);
            }
        });
    }

    public static final void KWHzl(C9658bZj c9658bZj, Function1 function1, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(SolanaTxResult.Companion.serializer());
            Intrinsics.copydefault((java.lang.Object) str);
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) C54907xZt.OLrzqt(kSerializerListSerializer, str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        function1.invoke(objM7377constructorimpl);
    }

    public final void OLrzqt(@NotNull final InterfaceC58257yxq<Unit> interfaceC58257yxq, @NotNull java.lang.String str, @NotNull final TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, @NotNull java.lang.String str2, @NotNull final LinkedHashMap<java.lang.Integer, java.lang.String> linkedHashMap, java.util.ArrayList<MultiUnitPriceAndLimit> arrayList, boolean z, boolean z2) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        C54892xZe c54892xZe = C54892xZe.KWHzl;
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        java.util.Collection<java.lang.String> collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.List<java.lang.String> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
        int iQwvEab = this.AEQbTJ.QwvEab();
        if (iQwvEab == 2) {
            str3 = "dapp";
        } else if (iQwvEab == 3) {
            str3 = "dex";
        } else if (iQwvEab == 4) {
            str3 = "nft";
        } else if (iQwvEab == 7) {
            str3 = "invest";
        }
        c54892xZe.EZpvd(applicationAEQbTJ, listAxsJAYsNCnLh, str2, str3, java.lang.Boolean.valueOf(z2), str, (!z || this.AEQbTJ.djSkpj()) ? null : arrayList, new android.webkit.ValueCallback() { // from class: o.bZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9658bZj.copydefault(this.copydefault, linkedHashMap, interfaceC58257yxq, treeMap, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(C9658bZj c9658bZj, LinkedHashMap linkedHashMap, InterfaceC58257yxq interfaceC58257yxq, TreeMap treeMap, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            JSONArray jSONArray = new JSONArray(str);
            java.util.Set setKeySet = linkedHashMap.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            int i = 0;
            for (java.lang.Object obj : setKeySet) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                treeMap.put((java.lang.Integer) obj, C56390yDp.OLrzqt(jSONObject.getString("encodeStr"), jSONObject.getString("encodeTransactionStr")));
                i++;
            }
            Unit unit = Unit.INSTANCE;
            interfaceC58257yxq.onSuccess(unit);
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            interfaceC58257yxq.onSuccess(Unit.INSTANCE);
        }
    }

    public final void EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.copydefault(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9658bZj.AYXKKw(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
    }

    public final void copydefault(@NotNull java.util.List<GenerateRawTransactionBean> list, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54892xZe.KWHzl.KWHzl(C9678baC.Companion.AEQbTJ(), list, new android.webkit.ValueCallback() { // from class: o.bZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9658bZj.gEmmrt(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54892xZe.KWHzl.AEQbTJ(str, str2);
    }
}
