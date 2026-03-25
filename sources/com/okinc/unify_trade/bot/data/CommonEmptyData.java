package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33070mpX;
import o.C52761wXj;
import o.C55688xof;
import o.C56402yEa;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CommonEmptyData implements Parcelable, EmptyData {
    public static final int $stable = 0;
    private final String btnText;
    private final int emptyType;
    private final int image;
    private final boolean isCenter;
    private final int marginBottom;
    private final int marginTop;
    private final boolean matchHeight;
    private final String msg;
    private final String title;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<CommonEmptyData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommonEmptyData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonEmptyData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommonEmptyData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonEmptyData[] newArray(int i) {
            return new CommonEmptyData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonEmptyData() {
        this(null, null, null, 0, 0, false, false, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.btnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.emptyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.matchHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonEmptyData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, boolean z, boolean z2, int i3, @DrawableRes int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CommonEmptyData(str, str2, str3, i, i2, z, z2, i3, i4);
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
        if (!(obj instanceof CommonEmptyData)) {
            return false;
        }
        CommonEmptyData commonEmptyData = (CommonEmptyData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) commonEmptyData.title) && Intrinsics.EZpvd((Object) this.msg, (Object) commonEmptyData.msg) && Intrinsics.EZpvd((Object) this.btnText, (Object) commonEmptyData.btnText) && this.emptyType == commonEmptyData.emptyType && this.marginTop == commonEmptyData.marginTop && this.isCenter == commonEmptyData.isCenter && this.matchHeight == commonEmptyData.matchHeight && this.marginBottom == commonEmptyData.marginBottom && this.image == commonEmptyData.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getBtnText() {
        return this.btnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getEmptyType() {
        return this.emptyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public int getMarginTop() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public boolean getMatchHeight() {
        return this.matchHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.title.hashCode() * 31) + this.msg.hashCode()) * 31) + this.btnText.hashCode()) * 31) + Integer.hashCode(this.emptyType)) * 31) + Integer.hashCode(this.marginTop)) * 31) + Boolean.hashCode(this.isCenter)) * 31) + Boolean.hashCode(this.matchHeight)) * 31) + Integer.hashCode(this.marginBottom)) * 31) + Integer.hashCode(this.image);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.EmptyData
    public boolean isCenter() {
        return this.isCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonEmptyData(title=" + this.title + ", msg=" + this.msg + ", btnText=" + this.btnText + ", emptyType=" + this.emptyType + ", marginTop=" + this.marginTop + ", isCenter=" + this.isCenter + ", matchHeight=" + this.matchHeight + ", marginBottom=" + this.marginBottom + ", image=" + this.image + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.msg);
        parcel.writeString(this.btnText);
        parcel.writeInt(this.emptyType);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.isCenter ? 1 : 0);
        parcel.writeInt(this.matchHeight ? 1 : 0);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.image);
    }

    public CommonEmptyData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, boolean z, boolean z2, int i3, @DrawableRes int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.msg = str2;
        this.btnText = str3;
        this.emptyType = i;
        this.marginTop = i2;
        this.isCenter = z;
        this.matchHeight = z2;
        this.marginBottom = i3;
        this.image = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 int) : (0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] o.wXj.TaskDescription.gCNefq int) : (r19v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void (m)] (LINE:800) call: com.okinc.unify_trade.bot.data.CommonEmptyData.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, int, int):void type: THIS */
    public /* synthetic */ CommonEmptyData(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) == 0 ? str3 : "", (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? true : z2, (i5 & 128) == 0 ? i3 : 0, (i5 & 256) != 0 ? C52761wXj.TaskDescription.gCNefq : i4);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.CommonEmptyData.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ List buildNoResultData$default(ActionBar actionBar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = C33070mpX.AYXKKw(C55688xof.Application.dXcUrg);
            }
            if ((i2 & 2) != 0) {
                i = 96;
            }
            return actionBar.AEQbTJ(str, i);
        }

        public final List<CommonEmptyData> AEQbTJ(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return C56402yEa.EZpvd(new CommonEmptyData(null, str, null, 7, i, false, false, 0, 0, 485, null));
        }

        public static /* synthetic */ List buildEmptyData$default(ActionBar actionBar, String str, int i, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = C33070mpX.AYXKKw(C55688xof.Application.WorkerThread);
            }
            if ((i2 & 2) != 0) {
                i = 96;
            }
            int i3 = i;
            String str4 = (i2 & 4) != 0 ? "" : str2;
            String str5 = (i2 & 8) == 0 ? str3 : "";
            if ((i2 & 16) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i2 & 32) != 0) {
                z2 = true;
            }
            return actionBar.copydefault(str, i3, str4, str5, z3, z2);
        }

        public final List<CommonEmptyData> copydefault(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return C56402yEa.EZpvd(new CommonEmptyData(str3, str, str2, 6, i, z, z2, 0, 0, MLKEMEngine.KyberPolyBytes, null));
        }

        public static /* synthetic */ List buildErrorData$default(ActionBar actionBar, String str, int i, boolean z, String str2, String str3, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = C33070mpX.AYXKKw(C55688xof.Application.putInt);
            }
            if ((i2 & 2) != 0) {
                i = 96;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = false;
            }
            boolean z3 = z;
            String str4 = (i2 & 8) != 0 ? "" : str2;
            String str5 = (i2 & 16) != 0 ? "" : str3;
            if ((i2 & 32) != 0) {
                z2 = true;
            }
            return actionBar.copydefault(str, i3, z3, str4, str5, z2);
        }

        public final List<CommonEmptyData> copydefault(@NotNull String str, int i, boolean z, @NotNull String str2, @NotNull String str3, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return C56402yEa.EZpvd(new CommonEmptyData((str2.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) str2)) ? C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi33Impl) : str2, (str.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) str)) ? C33070mpX.AYXKKw(C55688xof.Application.putInt) : str, (str3.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) str3)) ? C33070mpX.AYXKKw(C55688xof.Application.AuCTel) : str3, 8, i, z, z2, 0, 0, MLKEMEngine.KyberPolyBytes, null));
        }
    }
}
