package o;

import com.okinc.business.market.features.filter_tag.data.model.FilterTagData;
import com.okinc.business.market.features.filter_tag.repository.FilterTagRepositoryImpl$getHistoryFilterTags$2;
import com.okinc.business.market.features.filter_tag.repository.FilterTagRepositoryImpl$getHolderFilterTags$2;
import com.okinc.business.market.features.filter_tag.repository.FilterTagRepositoryImpl$getTraderFilterTags$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26212jWb implements jVZ {
    public final InterfaceC27595jyE EZpvd;

    @yCM
    public C26212jWb(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        this.EZpvd = interfaceC27595jyE;
    }

    @Override // o.jVZ
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FilterTagData>, OKServerException>> continuation) {
        return kAB.EZpvd(new FilterTagRepositoryImpl$getHolderFilterTags$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.jVZ
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FilterTagData>, OKServerException>> continuation) {
        return kAB.EZpvd(new FilterTagRepositoryImpl$getTraderFilterTags$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.jVZ
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<FilterTagData>, OKServerException>> continuation) {
        return kAB.EZpvd(new FilterTagRepositoryImpl$getHistoryFilterTags$2(this, str, str2, str3, null), continuation);
    }
}
