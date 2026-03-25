package com.reown.utils;

import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.type.SerializableJsonRpc;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.android.internal.utils.Time;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.net.URI;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC59982ztK;
import o.C56390yDp;
import o.C56523yIn;
import o.C56524yIo;
import o.C56529yIt;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60067zuq;
import o.InterfaceC56551yJo;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class UtilFunctionsKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ int getDefaultId(C56523yIn c56523yIn) {
        Intrinsics.checkNotNullParameter(c56523yIn, "");
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ String getEmpty(C56529yIt c56529yIt) {
        Intrinsics.checkNotNullParameter(c56529yIt, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ String getHexPrefix(C56529yIt c56529yIt) {
        Intrinsics.checkNotNullParameter(c56529yIt, "");
        return EIP1271Verifier.hexPrefix;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: ARITH (r2v0 long) / (wrap:long:0x0002: CAST (long) (1000 int)) (LINE:26) */
    public static final /* synthetic */ long extractTimestamp(long j) {
        return j / ((long) 1000);
    }

    public static final /* synthetic */ boolean isSequenceValid(Expiry expiry) {
        Intrinsics.checkNotNullParameter(expiry, "");
        return expiry.getSeconds() > Time.getCurrentTimeInSeconds();
    }

    public static final <T extends SerializableJsonRpc> C59976ztE<InterfaceC56551yJo<T>> addSerializerEntry(@NotNull C59991ztT c59991ztT, @NotNull final InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(InterfaceC56551yJo.class), C60058zuh.AEQbTJ("key_" + C60067zuq.KWHzl(interfaceC56551yJo)), new Function2<C60060zuj, C60053zuc, InterfaceC56551yJo<T>>() { // from class: com.reown.utils.UtilFunctionsKt.addSerializerEntry.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final InterfaceC56551yJo<T> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return interfaceC56551yJo;
            }
        }, Kind.Singleton, yDY.AhwBna()));
        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
        if (c59991ztT.OLrzqt()) {
            c59991ztT.KWHzl(c59990ztS);
        }
        return new C59976ztE<>(c59991ztT, c59990ztS);
    }

    public static final C59976ztE<Pair<String, InterfaceC56551yJo<?>>> addDeserializerEntry(@NotNull C59991ztT c59991ztT, @NotNull final String str, @NotNull final InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(Pair.class), C60058zuh.AEQbTJ(str + "_" + C60067zuq.KWHzl(interfaceC56551yJo)), new Function2<C60060zuj, C60053zuc, Pair<? extends String, ? extends InterfaceC56551yJo<?>>>() { // from class: com.reown.utils.UtilFunctionsKt.addDeserializerEntry.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Pair<String, InterfaceC56551yJo<?>> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return C56390yDp.OLrzqt(str, interfaceC56551yJo);
            }
        }, Kind.Singleton, yDY.AhwBna()));
        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
        if (c59991ztT.OLrzqt()) {
            c59991ztT.KWHzl(c59990ztS);
        }
        return new C59976ztE<>(c59991ztT, c59990ztS);
    }

    public static final <T> C59976ztE<JsonAdapterEntry<T>> addJsonAdapter(@NotNull C59991ztT c59991ztT, @NotNull Class<T> cls, @NotNull Function1<? super Moshi, ? extends JsonAdapter<T>> function1) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final JsonAdapterEntry jsonAdapterEntry = new JsonAdapterEntry(cls, function1);
        C60055zue c60055zueAEQbTJ = C60058zuh.AEQbTJ(String.valueOf(jsonAdapterEntry));
        Function2<C60060zuj, C60053zuc, JsonAdapterEntry<T>> function2 = new Function2<C60060zuj, C60053zuc, JsonAdapterEntry<T>>() { // from class: com.reown.utils.UtilFunctionsKt.addJsonAdapter.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final JsonAdapterEntry<T> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                Intrinsics.checkNotNullParameter(c60060zuj, "");
                Intrinsics.checkNotNullParameter(c60053zuc, "");
                return jsonAdapterEntry;
            }
        };
        C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(JsonAdapterEntry.class), c60055zueAEQbTJ, function2, Kind.Singleton, yDY.AhwBna()));
        c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
        if (c59991ztT.OLrzqt()) {
            c59991ztT.KWHzl(c59990ztS);
        }
        return new C59976ztE<>(c59991ztT, c59990ztS);
    }

    public static final /* synthetic */ boolean compareDomains(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            String host = new URI(str).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            String strKWHzl = StringsKt__StringsKt.KWHzl(host, (CharSequence) "www.");
            String host2 = new URI(str2).getHost();
            Intrinsics.checkNotNullExpressionValue(host2, "");
            return Intrinsics.EZpvd((Object) strKWHzl, (Object) StringsKt__StringsKt.KWHzl(host2, (CharSequence) "www."));
        } catch (Exception unused) {
            return false;
        }
    }
}
