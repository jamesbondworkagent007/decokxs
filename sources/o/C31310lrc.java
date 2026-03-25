package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31310lrc extends AbstractC31317lrj {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31310lrc KWHzl(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C31310lrc(l, str, str2, str3, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public java.lang.Long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31310lrc)) {
            return false;
        }
        C31310lrc c31310lrc = (C31310lrc) obj;
        return Intrinsics.EZpvd(this.KWHzl, c31310lrc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c31310lrc.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31310lrc.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31310lrc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31310lrc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31310lrc.djBIcL) && this.AhwBna == c31310lrc.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.KWHzl;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Long.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PhoneNumberContact(contactId=" + this.KWHzl + ", contactName=" + this.AYXKKw + ", contactAvatar=" + this.AEQbTJ + ", contactDisplay=" + this.EZpvd + ", areaCode=" + this.OLrzqt + ", phoneNumber=" + this.djBIcL + ", createdTime=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31317lrj
    public long valueOf() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31310lrc(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = l;
        this.AYXKKw = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.djBIcL = str5;
        this.AhwBna = j;
        this.copydefault = KWHzl(str4, str5);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return str + " " + str2;
    }

    /* JADX INFO: renamed from: o.lrc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lrc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C31310lrc EZpvd(java.lang.Long l, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str4, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
            return new C31310lrc(l, str, str2, str3, (java.lang.String) listSplit$default.get(0), (java.lang.String) listSplit$default.get(1), j);
        }
    }
}
