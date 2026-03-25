package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LanguageUnit;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import o.C33486mxP;
import o.C38314pUe;
import o.C43246rlf;
import o.C56391yDq;
import o.C56442yFn;
import o.oJV;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguageFallbackRepo$getFallbackLocaleInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LanguageUnit>, Object> {
    final /* synthetic */ Locale $checkLocale;
    final /* synthetic */ String $market;
    int label;
    final /* synthetic */ C38314pUe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageFallbackRepo$getFallbackLocaleInternal$2(C38314pUe c38314pUe, Locale locale, String str, Continuation<? super LanguageFallbackRepo$getFallbackLocaleInternal$2> continuation) {
        super(2, continuation);
        this.this$0 = c38314pUe;
        this.$checkLocale = locale;
        this.$market = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguageFallbackRepo$getFallbackLocaleInternal$2(this.this$0, this.$checkLocale, this.$market, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LanguageUnit> continuation) {
        return ((LanguageFallbackRepo$getFallbackLocaleInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt()) {
                String strEZpvd = C33486mxP.EZpvd(C43246rlf.OLrzqt.valueOf(), this.this$0.EZpvd(this.$market));
                Json jsonDbNXlk = oJV.AEQbTJ.DbNXlk();
                Intrinsics.copydefault((Object) strEZpvd);
                JsonElement toJsonElement = jsonDbNXlk.parseToJsonElement(strEZpvd);
                JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "languages");
                Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement == null ? null : JsonElementKt.getJsonObject(jsonElement).entrySet();
                String strOLrzqt = this.this$0.OLrzqt(this.$checkLocale, setEntrySet);
                if (strOLrzqt != null) {
                    String str = this.$market;
                    pUU.KWHzl("LanguageFallbackRepo", "getFallbackLocaleInternal, findFullMatchLocale result:" + strOLrzqt);
                    String languageTag = Locale.forLanguageTag(strOLrzqt).toLanguageTag();
                    Intrinsics.checkNotNullExpressionValue(languageTag, "");
                    return new LanguageUnit(str, languageTag);
                }
                JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((Object) "singleVariantList");
                String strAEQbTJ = this.this$0.AEQbTJ(this.$checkLocale, this.this$0.KWHzl(jsonElement2 != null ? JsonElementKt.getJsonArray(jsonElement2) : null, setEntrySet));
                if (strAEQbTJ != null) {
                    String str2 = this.$market;
                    pUU.KWHzl("LanguageFallbackRepo", "getFallbackLocaleInternal, findSingleMatchLocale result:" + strAEQbTJ);
                    String languageTag2 = Locale.forLanguageTag(strAEQbTJ).toLanguageTag();
                    Intrinsics.checkNotNullExpressionValue(languageTag2, "");
                    return new LanguageUnit(str2, languageTag2);
                }
                pUU.KWHzl("LanguageFallbackRepo", "getFallbackLocaleInternal, no matched locale, return default");
                C38314pUe c38314pUe = this.this$0;
                String str3 = this.$market;
                this.label = 1;
                obj = c38314pUe.EZpvd(str3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.KWHzl("LanguageFallbackRepo", "getFallbackLocaleInternal, no fallback file. return:" + this.$checkLocale);
                String str4 = this.$market;
                String languageTag3 = this.$checkLocale.toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag3, "");
                return new LanguageUnit(str4, languageTag3);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
