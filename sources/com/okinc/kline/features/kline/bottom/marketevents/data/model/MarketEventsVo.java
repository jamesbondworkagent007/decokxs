package com.okinc.kline.features.kline.bottom.marketevents.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class MarketEventsVo {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MarketEventsVo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarketEventsVo() {
    }

    public static final class TaskDescription extends MarketEventsVo {
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(long j) {
            return new TaskDescription(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.OLrzqt == ((TaskDescription) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Header(timeStamps=" + this.OLrzqt + ")";
        }

        public TaskDescription(long j) {
            super(null);
            this.OLrzqt = j;
        }
    }

    public static final class Content extends MarketEventsVo implements Parcelable {
        public static final Parcelable.Creator<Content> CREATOR = new Creator();
        public final String AEQbTJ;
        public final MarketEventResp.BigEventPo AYXKKw;
        public final String AhwBna;
        public final List<String> EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public boolean djBIcL;
        public final String valueOf;

        public static final class Creator implements Parcelable.Creator<Content> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Content(MarketEventResp.BigEventPo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i) {
                return new Content[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Content OLrzqt(@NotNull MarketEventResp.BigEventPo bigEventPo, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, String str5, String str6, List<String> list) {
            Intrinsics.checkNotNullParameter(bigEventPo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Content(bigEventPo, str, str2, z, str3, str4, str5, str6, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MarketEventResp.BigEventPo djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.EZpvd(this.AYXKKw, content.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) content.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) content.OLrzqt) && this.djBIcL == content.djBIcL && Intrinsics.EZpvd((Object) this.valueOf, (Object) content.valueOf) && Intrinsics.EZpvd((Object) this.copydefault, (Object) content.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) content.AhwBna) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) content.KWHzl) && Intrinsics.EZpvd(this.EZpvd, content.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = Boolean.hashCode(this.djBIcL);
            int iHashCode5 = this.valueOf.hashCode();
            int iHashCode6 = this.copydefault.hashCode();
            String str = this.AhwBna;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            List<String> list = this.EZpvd;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Content(originData=" + this.AYXKKw + ", content=" + this.AEQbTJ + ", eventType=" + this.OLrzqt + ", isShowAllContent=" + this.djBIcL + ", title=" + this.valueOf + ", desc=" + this.copydefault + ", explanation=" + this.AhwBna + ", address=" + this.KWHzl + ", authorIds=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.AYXKKw.writeToParcel(parcel, i);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.djBIcL ? 1 : 0);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AhwBna);
            parcel.writeString(this.KWHzl);
            parcel.writeStringList(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (r13v0 com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp$BigEventPo)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
 A[MD:(com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp$BigEventPo, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:30) call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo.Content.<init>(com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp$BigEventPo, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ Content(MarketEventResp.BigEventPo bigEventPo, String str, String str2, boolean z, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigEventPo, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(@NotNull MarketEventResp.BigEventPo bigEventPo, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, String str5, String str6, List<String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(bigEventPo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.AYXKKw = bigEventPo;
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.djBIcL = z;
            this.valueOf = str3;
            this.copydefault = str4;
            this.AhwBna = str5;
            this.KWHzl = str6;
            this.EZpvd = list;
        }
    }
}
