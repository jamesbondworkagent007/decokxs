package com.okinc.okex.uploadlog.view.displaymodels;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okex.uploadlog.bean.FieldOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ExtraFormData implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExtraFormData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExtraFormData() {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class DateInfo extends ExtraFormData {
        public static final Parcelable.Creator<DateInfo> CREATOR = new Creator();
        public final int AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<DateInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DateInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateInfo[] newArray(int i) {
                return new DateInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DateInfo copy$default(DateInfo dateInfo, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = dateInfo.AEQbTJ;
            }
            if ((i6 & 2) != 0) {
                i2 = dateInfo.KWHzl;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = dateInfo.EZpvd;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = dateInfo.copydefault;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = dateInfo.OLrzqt;
            }
            return dateInfo.KWHzl(i, i7, i8, i9, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DateInfo KWHzl(int i, int i2, int i3, int i4, int i5) {
            return new DateInfo(i, i2, i3, i4, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
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
            if (!(obj instanceof DateInfo)) {
                return false;
            }
            DateInfo dateInfo = (DateInfo) obj;
            return this.AEQbTJ == dateInfo.AEQbTJ && this.KWHzl == dateInfo.KWHzl && this.EZpvd == dateInfo.EZpvd && this.copydefault == dateInfo.copydefault && this.OLrzqt == dateInfo.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Integer.hashCode(this.AEQbTJ) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DateInfo(year=" + this.AEQbTJ + ", month=" + this.KWHzl + ", day=" + this.EZpvd + ", hour=" + this.copydefault + ", minute=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ);
            parcel.writeInt(this.KWHzl);
            parcel.writeInt(this.EZpvd);
            parcel.writeInt(this.copydefault);
            parcel.writeInt(this.OLrzqt);
        }

        public DateInfo(int i, int i2, int i3, int i4, int i5) {
            super(null);
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.EZpvd = i3;
            this.copydefault = i4;
            this.OLrzqt = i5;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class DropdownInfo extends ExtraFormData {
        public static final Parcelable.Creator<DropdownInfo> CREATOR = new Creator();
        public final List<FieldOption> EZpvd;
        public final String KWHzl;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<DropdownInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(FieldOption.CREATOR.createFromParcel(parcel));
                }
                return new DropdownInfo(arrayList, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownInfo[] newArray(int i) {
                return new DropdownInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData$DropdownInfo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DropdownInfo copy$default(DropdownInfo dropdownInfo, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dropdownInfo.EZpvd;
            }
            if ((i & 2) != 0) {
                str = dropdownInfo.KWHzl;
            }
            return dropdownInfo.copydefault(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DropdownInfo copydefault(@NotNull List<FieldOption> list, String str) {
            Intrinsics.checkNotNullParameter(list, "");
            return new DropdownInfo(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<FieldOption> copydefault() {
            return this.EZpvd;
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
            if (!(obj instanceof DropdownInfo)) {
                return false;
            }
            DropdownInfo dropdownInfo = (DropdownInfo) obj;
            return Intrinsics.EZpvd(this.EZpvd, dropdownInfo.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dropdownInfo.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            String str = this.KWHzl;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DropdownInfo(options=" + this.EZpvd + ", selectedValue=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<FieldOption> list = this.EZpvd;
            parcel.writeInt(list.size());
            Iterator<FieldOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.okex.uploadlog.bean.FieldOption>, java.lang.String):void (m)] (LINE:30) call: com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData.DropdownInfo.<init>(java.util.List, java.lang.String):void type: THIS */
        public /* synthetic */ DropdownInfo(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropdownInfo(@NotNull List<FieldOption> list, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.KWHzl = str;
        }
    }

    public static final class AttachmentInfo extends ExtraFormData {
        public static final Parcelable.Creator<AttachmentInfo> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final long KWHzl;
        public final String OLrzqt;
        public final State copydefault;
        public final Uri valueOf;

        public static final class Creator implements Parcelable.Creator<AttachmentInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AttachmentInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AttachmentInfo((Uri) parcel.readParcelable(AttachmentInfo.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readString(), State.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AttachmentInfo[] newArray(int i) {
                return new AttachmentInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AttachmentInfo copy$default(AttachmentInfo attachmentInfo, Uri uri, String str, long j, String str2, State state, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = attachmentInfo.valueOf;
            }
            if ((i & 2) != 0) {
                str = attachmentInfo.OLrzqt;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                j = attachmentInfo.KWHzl;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str2 = attachmentInfo.AEQbTJ;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                state = attachmentInfo.copydefault;
            }
            State state2 = state;
            if ((i & 32) != 0) {
                str3 = attachmentInfo.EZpvd;
            }
            return attachmentInfo.copydefault(uri, str4, j2, str5, state2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final State OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AttachmentInfo copydefault(@NotNull Uri uri, @NotNull String str, long j, @NotNull String str2, @NotNull State state, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new AttachmentInfo(uri, str, j, str2, state, str3);
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
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttachmentInfo)) {
                return false;
            }
            AttachmentInfo attachmentInfo = (AttachmentInfo) obj;
            return Intrinsics.EZpvd(this.valueOf, attachmentInfo.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) attachmentInfo.OLrzqt) && this.KWHzl == attachmentInfo.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) attachmentInfo.AEQbTJ) && this.copydefault == attachmentInfo.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) attachmentInfo.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.valueOf.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + Long.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AttachmentInfo(uri=" + this.valueOf + ", fileId=" + this.OLrzqt + ", fileSize=" + this.KWHzl + ", sizeLabel=" + this.AEQbTJ + ", attachState=" + this.copydefault + ", alertMsg=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Uri valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.valueOf, i);
            parcel.writeString(this.OLrzqt);
            parcel.writeLong(this.KWHzl);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.copydefault.name());
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 android.net.Uri)
  (r11v0 java.lang.String)
  (r12v0 long)
  (r14v0 java.lang.String)
  (r15v0 com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData$AttachmentInfo$State)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
 A[MD:(android.net.Uri, java.lang.String, long, java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData$AttachmentInfo$State, java.lang.String):void (m)] (LINE:36) call: com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData.AttachmentInfo.<init>(android.net.Uri, java.lang.String, long, java.lang.String, com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData$AttachmentInfo$State, java.lang.String):void type: THIS */
        public /* synthetic */ AttachmentInfo(Uri uri, String str, long j, String str2, State state, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, str, j, str2, state, (i & 32) != 0 ? "" : str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttachmentInfo(@NotNull Uri uri, @NotNull String str, long j, @NotNull String str2, @NotNull State state, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.valueOf = uri;
            this.OLrzqt = str;
            this.KWHzl = j;
            this.AEQbTJ = str2;
            this.copydefault = state;
            this.EZpvd = str3;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class State {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State LOADING = new State("LOADING", 0);
            public static final State SUCCESS = new State("SUCCESS", 1);
            public static final State FAILED = new State(CardSyncResponse.FAILED, 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ State[] $values() {
                return new State[]{LOADING, SUCCESS, FAILED};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<State> getEntries() {
                return $ENTRIES;
            }

            private State(String str, int i) {
            }

            static {
                State[] stateArr$values = $values();
                $VALUES = stateArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(stateArr$values);
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }
    }
}
