package com.okinc.okex.rating.net;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import o.ActivityC45832syy;
import o.C45305snL;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import o.syD;
import o.syN;
import o.syV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class RatingResult implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sxJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return RatingResult.OLrzqt();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.net.RatingResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RatingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.net.RatingResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) RatingResult.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RatingResult> serializer() {
            return KWHzl();
        }
    }

    private RatingResult() {
    }

    public static final /* synthetic */ KSerializer OLrzqt() {
        return new SealedClassSerializer("com.okinc.okex.rating.net.RatingResult", C56524yIo.AEQbTJ(RatingResult.class), new InterfaceC56551yJo[0], new KSerializer[0], new Annotation[0]);
    }

    public static final class SubmittedAlready extends RatingResult {
        public static final SubmittedAlready copydefault = new SubmittedAlready();
        public static final Parcelable.Creator<SubmittedAlready> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SubmittedAlready> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmittedAlready createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return SubmittedAlready.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmittedAlready[] newArray(int i) {
                return new SubmittedAlready[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private SubmittedAlready() {
            super(null);
        }
    }

    public static final class NoRating extends RatingResult {
        public static final NoRating EZpvd = new NoRating();
        public static final Parcelable.Creator<NoRating> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<NoRating> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoRating createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NoRating.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoRating[] newArray(int i) {
                return new NoRating[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private NoRating() {
            super(null);
        }
    }

    public static final class Expired extends RatingResult {
        public static final Expired OLrzqt = new Expired();
        public static final Parcelable.Creator<Expired> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Expired> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Expired createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Expired.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Expired[] newArray(int i) {
                return new Expired[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Expired() {
            super(null);
        }
    }

    public static final class BottomSheet extends RatingResult {
        public static final Parcelable.Creator<BottomSheet> CREATOR = new Creator();
        public final String AEQbTJ;
        public final JsonObject KWHzl;
        public final String OLrzqt;
        public final GetSupportRatingBean copydefault;

        public static final class Creator implements Parcelable.Creator<BottomSheet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BottomSheet(GetSupportRatingBean.CREATOR.createFromParcel(parcel), parcel.readString(), C45305snL.EZpvd.OLrzqt(parcel), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BottomSheet[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                getSupportRatingBean = bottomSheet.copydefault;
            }
            if ((i & 2) != 0) {
                str = bottomSheet.OLrzqt;
            }
            if ((i & 4) != 0) {
                jsonObject = bottomSheet.KWHzl;
            }
            if ((i & 8) != 0) {
                str2 = bottomSheet.AEQbTJ;
            }
            return bottomSheet.EZpvd(getSupportRatingBean, str, jsonObject, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonObject AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BottomSheet EZpvd(@NotNull GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2) {
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            return new BottomSheet(getSupportRatingBean, str, jsonObject, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GetSupportRatingBean KWHzl() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj;
            return Intrinsics.EZpvd(this.copydefault, bottomSheet.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bottomSheet.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, bottomSheet.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bottomSheet.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            String str = this.OLrzqt;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            JsonObject jsonObject = this.KWHzl;
            int iHashCode3 = jsonObject == null ? 0 : jsonObject.hashCode();
            String str2 = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BottomSheet(model=" + this.copydefault + ", ratingNotificationId=" + this.OLrzqt + ", moduleAttributes=" + this.KWHzl + ", businessId=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.copydefault.writeToParcel(parcel, i);
            parcel.writeString(this.OLrzqt);
            C45305snL.EZpvd.KWHzl(this.KWHzl, parcel, i);
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomSheet(@NotNull GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            this.copydefault = getSupportRatingBean;
            this.OLrzqt = str;
            this.KWHzl = jsonObject;
            this.AEQbTJ = str2;
        }
    }

    public static final class FullPage extends RatingResult {
        public static final Parcelable.Creator<FullPage> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final GetSupportRatingBean KWHzl;
        public final JsonObject copydefault;

        public static final class Creator implements Parcelable.Creator<FullPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FullPage(GetSupportRatingBean.CREATOR.createFromParcel(parcel), parcel.readString(), C45305snL.EZpvd.OLrzqt(parcel), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullPage[] newArray(int i) {
                return new FullPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FullPage copy$default(FullPage fullPage, GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                getSupportRatingBean = fullPage.KWHzl;
            }
            if ((i & 2) != 0) {
                str = fullPage.AEQbTJ;
            }
            if ((i & 4) != 0) {
                jsonObject = fullPage.copydefault;
            }
            if ((i & 8) != 0) {
                str2 = fullPage.EZpvd;
            }
            return fullPage.OLrzqt(getSupportRatingBean, str, jsonObject, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonObject AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GetSupportRatingBean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullPage OLrzqt(@NotNull GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2) {
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            return new FullPage(getSupportRatingBean, str, jsonObject, str2);
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
            if (!(obj instanceof FullPage)) {
                return false;
            }
            FullPage fullPage = (FullPage) obj;
            return Intrinsics.EZpvd(this.KWHzl, fullPage.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) fullPage.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, fullPage.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) fullPage.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            String str = this.AEQbTJ;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            JsonObject jsonObject = this.copydefault;
            int iHashCode3 = jsonObject == null ? 0 : jsonObject.hashCode();
            String str2 = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FullPage(model=" + this.KWHzl + ", ratingNotificationId=" + this.AEQbTJ + ", moduleAttributes=" + this.copydefault + ", businessId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.KWHzl.writeToParcel(parcel, i);
            parcel.writeString(this.AEQbTJ);
            C45305snL.EZpvd.KWHzl(this.copydefault, parcel, i);
            parcel.writeString(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullPage(@NotNull GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            this.KWHzl = getSupportRatingBean;
            this.AEQbTJ = str;
            this.copydefault = jsonObject;
            this.EZpvd = str2;
        }
    }

    public static final class Failure extends RatingResult {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        public final Throwable EZpvd;

        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failure((Throwable) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.EZpvd;
            }
            return failure.KWHzl(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure KWHzl(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Failure(th);
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
            return (obj instanceof Failure) && Intrinsics.EZpvd(this.EZpvd, ((Failure) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(throwable=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = th;
        }
    }

    public static /* synthetic */ Intent toIntent$default(RatingResult ratingResult, Context context, JsonObject jsonObject, PreSubmitRatingBean preSubmitRatingBean, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toIntent");
        }
        if ((i & 2) != 0) {
            jsonObject = null;
        }
        if ((i & 4) != 0) {
            preSubmitRatingBean = null;
        }
        return ratingResult.AEQbTJ(context, jsonObject, preSubmitRatingBean);
    }

    public final Intent AEQbTJ(@NotNull Context context, JsonObject jsonObject, PreSubmitRatingBean preSubmitRatingBean) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this instanceof BottomSheet) {
            syN.StateListAnimator stateListAnimator = syN.Companion;
            BottomSheet bottomSheet = (BottomSheet) this;
            GetSupportRatingBean getSupportRatingBeanKWHzl = bottomSheet.KWHzl();
            String strDjBIcL = bottomSheet.djBIcL();
            if (jsonObject == null) {
                jsonObject = bottomSheet.AhwBna();
            }
            return stateListAnimator.AEQbTJ(context, getSupportRatingBeanKWHzl, strDjBIcL, jsonObject, preSubmitRatingBean, bottomSheet.EZpvd());
        }
        if (this instanceof FullPage) {
            syV.ActionBar actionBar = syV.Companion;
            FullPage fullPage = (FullPage) this;
            GetSupportRatingBean getSupportRatingBeanEZpvd = fullPage.EZpvd();
            String strGEmmrt = fullPage.gEmmrt();
            if (jsonObject == null) {
                jsonObject = fullPage.AYXKKw();
            }
            return actionBar.EZpvd(context, getSupportRatingBeanEZpvd, strGEmmrt, jsonObject, preSubmitRatingBean, fullPage.KWHzl());
        }
        if (this instanceof SubmittedAlready) {
            return syD.Companion.OLrzqt(context);
        }
        if (this instanceof Expired) {
            return ActivityC45832syy.Companion.KWHzl(context);
        }
        if ((this instanceof NoRating) || (this instanceof Failure)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
