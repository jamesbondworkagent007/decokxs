package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PatternMatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PatternMatcher {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final ParcelUuid AYXKKw;
    public final java.lang.String AhwBna;
    public final OnObbStateChangeListener AkhnZx;
    public final java.lang.String AuCTel;
    public final C5173Hn DbNXlk;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final PooledStringReader djBIcL;
    public final C5173Hn ejfBZ;
    public final ContactsContract fIwbmz;
    public final java.lang.String fJNWhG;
    public final C5173Hn fetchVPNInfo;
    public final SynchronousResultReceiver gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final ParcelableException values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PatternMatcher$StateListAnimator) A[MD:(o.PatternMatcher$StateListAnimator):void (m)] call: o.PatternMatcher.<init>(o.PatternMatcher$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PatternMatcher(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParcelUuid OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParcelableException djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract fARcdN() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PooledStringReader valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnObbStateChangeListener values() {
        return this.AkhnZx;
    }

    public PatternMatcher(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.gEmmrt();
        this.AYXKKw = stateListAnimator.valueOf();
        this.gEmmrt = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.djBIcL();
        this.valueOf = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.DbNXlk();
        this.values = stateListAnimator.values();
        this.isConnected = stateListAnimator.fetchVPNInfo();
        this.AkhnZx = stateListAnimator.isConnected();
        this.DbNXlk = stateListAnimator.AkhnZx();
        this.fetchVPNInfo = stateListAnimator.fJNWhG();
        this.ejfBZ = stateListAnimator.fARcdN();
        this.AuCTel = stateListAnimator.AuCTel();
        this.fJNWhG = stateListAnimator.ejfBZ();
        this.fIwbmz = stateListAnimator.fIwbmz();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PatternMatcher.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityRecognizerProperties(");
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("entityRecognizerArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("modelKmsKeyId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("recognizerMetadata=*** Sensitive Data Redacted ***,");
        sb.append("sourceModelArn=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("trainingEndTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("trainingStartTime=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("versionName=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.fIwbmz);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        ParcelUuid parcelUuid = this.AYXKKw;
        int iHashCode5 = parcelUuid != null ? parcelUuid.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.gEmmrt;
        int iHashCode6 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        PooledStringReader pooledStringReader = this.djBIcL;
        int iHashCode9 = pooledStringReader != null ? pooledStringReader.hashCode() : 0;
        ParcelableException parcelableException = this.values;
        int iHashCode10 = parcelableException != null ? parcelableException.hashCode() : 0;
        java.lang.String str6 = this.isConnected;
        int iHashCode11 = str6 != null ? str6.hashCode() : 0;
        OnObbStateChangeListener onObbStateChangeListener = this.AkhnZx;
        int iHashCode12 = onObbStateChangeListener != null ? onObbStateChangeListener.hashCode() : 0;
        C5173Hn c5173Hn2 = this.DbNXlk;
        int iHashCode13 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        C5173Hn c5173Hn3 = this.fetchVPNInfo;
        int iHashCode14 = c5173Hn3 != null ? c5173Hn3.hashCode() : 0;
        C5173Hn c5173Hn4 = this.ejfBZ;
        int iHashCode15 = c5173Hn4 != null ? c5173Hn4.hashCode() : 0;
        java.lang.String str7 = this.AuCTel;
        int iHashCode16 = str7 != null ? str7.hashCode() : 0;
        java.lang.String str8 = this.fJNWhG;
        int iHashCode17 = str8 != null ? str8.hashCode() : 0;
        ContactsContract contactsContract = this.fIwbmz;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PatternMatcher.class != obj.getClass()) {
            return false;
        }
        PatternMatcher patternMatcher = (PatternMatcher) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) patternMatcher.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, patternMatcher.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) patternMatcher.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) patternMatcher.copydefault) && Intrinsics.EZpvd(this.AYXKKw, patternMatcher.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, patternMatcher.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) patternMatcher.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) patternMatcher.valueOf) && Intrinsics.EZpvd(this.djBIcL, patternMatcher.djBIcL) && Intrinsics.EZpvd(this.values, patternMatcher.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) patternMatcher.isConnected) && Intrinsics.EZpvd(this.AkhnZx, patternMatcher.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, patternMatcher.DbNXlk) && Intrinsics.EZpvd(this.fetchVPNInfo, patternMatcher.fetchVPNInfo) && Intrinsics.EZpvd(this.ejfBZ, patternMatcher.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) patternMatcher.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) patternMatcher.fJNWhG) && Intrinsics.EZpvd(this.fIwbmz, patternMatcher.fIwbmz);
    }

    public static /* synthetic */ PatternMatcher copy$default(PatternMatcher patternMatcher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognizerProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PatternMatcher.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PatternMatcher.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(patternMatcher);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public PooledStringReader AYXKKw;
        public java.lang.String AhwBna;
        public C5173Hn AkhnZx;
        public ContactsContract AuCTel;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public ParcelUuid copydefault;
        public SynchronousResultReceiver djBIcL;
        public java.lang.String ejfBZ;
        public java.lang.String fARcdN;
        public OnObbStateChangeListener fetchVPNInfo;
        public java.lang.String gEmmrt;
        public C5173Hn isConnected;
        public ParcelableException valueOf;
        public C5173Hn values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ContactsContract contactsContract) {
            this.AuCTel = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.AkhnZx = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ParcelableException parcelableException) {
            this.valueOf = parcelableException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.ejfBZ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PooledStringReader DbNXlk() {
            return this.AYXKKw;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ParcelUuid parcelUuid) {
            this.copydefault = parcelUuid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(PooledStringReader pooledStringReader) {
            this.AYXKKw = pooledStringReader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.values = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SynchronousResultReceiver synchronousResultReceiver) {
            this.djBIcL = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.isConnected = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(OnObbStateChangeListener onObbStateChangeListener) {
            this.fetchVPNInfo = onObbStateChangeListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.fARcdN = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fARcdN() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract fIwbmz() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fJNWhG() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnObbStateChangeListener isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ParcelUuid valueOf() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ParcelableException values() {
            return this.valueOf;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PatternMatcher patternMatcher) {
            this();
            Intrinsics.checkNotNullParameter(patternMatcher, "");
            this.AEQbTJ = patternMatcher.copydefault();
            this.OLrzqt = patternMatcher.AEQbTJ();
            this.KWHzl = patternMatcher.EZpvd();
            this.EZpvd = patternMatcher.KWHzl();
            this.copydefault = patternMatcher.OLrzqt();
            this.djBIcL = patternMatcher.gEmmrt();
            this.AhwBna = patternMatcher.AYXKKw();
            this.gEmmrt = patternMatcher.AhwBna();
            this.AYXKKw = patternMatcher.valueOf();
            this.valueOf = patternMatcher.djBIcL();
            this.DbNXlk = patternMatcher.AkhnZx();
            this.fetchVPNInfo = patternMatcher.values();
            this.values = patternMatcher.DbNXlk();
            this.AkhnZx = patternMatcher.fetchVPNInfo();
            this.isConnected = patternMatcher.isConnected();
            this.fARcdN = patternMatcher.fJNWhG();
            this.ejfBZ = patternMatcher.AuCTel();
            this.AuCTel = patternMatcher.fARcdN();
        }

        public final PatternMatcher KWHzl() {
            return new PatternMatcher(this, null);
        }
    }
}
