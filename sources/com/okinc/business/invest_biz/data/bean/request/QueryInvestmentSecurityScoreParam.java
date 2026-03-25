package com.okinc.business.invest_biz.data.bean.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class QueryInvestmentSecurityScoreParam implements Parcelable {
    public static final int $stable = 0;
    private final long investmentId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<QueryInvestmentSecurityScoreParam> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<QueryInvestmentSecurityScoreParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryInvestmentSecurityScoreParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QueryInvestmentSecurityScoreParam(parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryInvestmentSecurityScoreParam[] newArray(int i) {
            return new QueryInvestmentSecurityScoreParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryInvestmentSecurityScoreParam copy$default(QueryInvestmentSecurityScoreParam queryInvestmentSecurityScoreParam, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = queryInvestmentSecurityScoreParam.investmentId;
        }
        return queryInvestmentSecurityScoreParam.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryInvestmentSecurityScoreParam copy(long j) {
        return new QueryInvestmentSecurityScoreParam(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueryInvestmentSecurityScoreParam) && this.investmentId == ((QueryInvestmentSecurityScoreParam) obj).investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.investmentId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryInvestmentSecurityScoreParam(investmentId=" + this.investmentId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.QueryInvestmentSecurityScoreParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QueryInvestmentSecurityScoreParam> serializer() {
            return QueryInvestmentSecurityScoreParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QueryInvestmentSecurityScoreParam(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, QueryInvestmentSecurityScoreParam$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
    }

    public QueryInvestmentSecurityScoreParam(long j) {
        this.investmentId = j;
    }
}
