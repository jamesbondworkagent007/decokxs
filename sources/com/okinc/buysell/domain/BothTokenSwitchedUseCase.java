package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.lyO;
import o.lyV;
import o.lyZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BothTokenSwitchedUseCase {
    public final lyV AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final lyZ KWHzl;
    public final lyO OLrzqt;

    @yCM
    public BothTokenSwitchedUseCase(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull lyV lyv, @NotNull lyO lyo, @NotNull lyZ lyz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(lyv, "");
        Intrinsics.checkNotNullParameter(lyo, "");
        Intrinsics.checkNotNullParameter(lyz, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = lyv;
        this.OLrzqt = lyo;
        this.KWHzl = lyz;
    }

    public final Object KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull String str, @NotNull Continuation<? super AbstractC43419rot<? extends Triple<ConvertCurrencyBean, ConvertCurrencyBean, ? extends List<ConvertCurrencyBean>>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new BothTokenSwitchedUseCase$invoke$2(convertCurrencyBean, convertCurrencyBean2, this, str, null), continuation);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ApiTask {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ApiTask[] $VALUES;
        public static final ApiTask GET_CONVERT_FROM_LIST = new ApiTask("GET_CONVERT_FROM_LIST", 0);
        public static final ApiTask GET_CONVERT_TO_LIST = new ApiTask("GET_CONVERT_TO_LIST", 1);
        public static final ApiTask GET_PAIR_SUGGESTION = new ApiTask("GET_PAIR_SUGGESTION", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ApiTask[] $values() {
            return new ApiTask[]{GET_CONVERT_FROM_LIST, GET_CONVERT_TO_LIST, GET_PAIR_SUGGESTION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ApiTask> getEntries() {
            return $ENTRIES;
        }

        private ApiTask(String str, int i) {
        }

        static {
            ApiTask[] apiTaskArr$values = $values();
            $VALUES = apiTaskArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(apiTaskArr$values);
        }

        public static ApiTask valueOf(String str) {
            return (ApiTask) Enum.valueOf(ApiTask.class, str);
        }

        public static ApiTask[] values() {
            return (ApiTask[]) $VALUES.clone();
        }
    }
}
