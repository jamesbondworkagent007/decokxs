package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SmartSelectSprite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SmartSelectSprite {
    public static final Application OLrzqt = new Application(null);
    public final WebViewZygote AEQbTJ;
    public final SimpleMonthView AYXKKw;
    public final SlidingDrawer AhwBna;
    public final java.util.List<C> AkhnZx;
    public final TableLayout DbNXlk;
    public final java.lang.Float EZpvd;
    public final WebSyncManager KWHzl;
    public final WebViewFactory copydefault;
    public final Switch djBIcL;
    public final C9940bf ejfBZ;
    public final C9569bY fARcdN;
    public final C27696k fJNWhG;
    public final C8084aw fetchVPNInfo;
    public final SimpleCursorTreeAdapter gEmmrt;
    public final C7556am isConnected;
    public final java.util.List<SeekBar> valueOf;
    public final C7450ak values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SmartSelectSprite$StateListAnimator) A[MD:(o.SmartSelectSprite$StateListAnimator):void (m)] call: o.SmartSelectSprite.<init>(o.SmartSelectSprite$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SmartSelectSprite(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewFactory AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlidingDrawer AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleMonthView AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7556am AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9940bf AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8084aw DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebSyncManager KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SeekBar> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleCursorTreeAdapter djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9569bY fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TableLayout gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7450ak isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Switch valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27696k values() {
        return this.fJNWhG;
    }

    public SmartSelectSprite(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.djBIcL();
        this.gEmmrt = stateListAnimator.valueOf();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.AYXKKw = stateListAnimator.AhwBna();
        this.djBIcL = stateListAnimator.values();
        this.DbNXlk = stateListAnimator.fetchVPNInfo();
        this.AkhnZx = stateListAnimator.DbNXlk();
        this.values = stateListAnimator.AkhnZx();
        this.isConnected = stateListAnimator.isConnected();
        this.fetchVPNInfo = stateListAnimator.fJNWhG();
        this.fJNWhG = stateListAnimator.ejfBZ();
        this.ejfBZ = stateListAnimator.fARcdN();
        this.fARcdN = stateListAnimator.fIwbmz();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SmartSelectSprite.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FaceDetail(");
        sb.append("ageRange=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("beard=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("boundingBox=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("emotions=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("eyeDirection=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("eyeglasses=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("eyesOpen=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("faceOccluded=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("gender=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("landmarks=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("mouthOpen=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("mustache=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("pose=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("quality=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("smile=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sunglasses=");
        sb2.append(this.fARcdN);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebSyncManager webSyncManager = this.KWHzl;
        int iHashCode = webSyncManager != null ? webSyncManager.hashCode() : 0;
        WebViewFactory webViewFactory = this.copydefault;
        int iHashCode2 = webViewFactory != null ? webViewFactory.hashCode() : 0;
        WebViewZygote webViewZygote = this.AEQbTJ;
        int iHashCode3 = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.EZpvd;
        int iHashCode4 = f != null ? f.hashCode() : 0;
        java.util.List<SeekBar> list = this.valueOf;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        SimpleCursorTreeAdapter simpleCursorTreeAdapter = this.gEmmrt;
        int iHashCode6 = simpleCursorTreeAdapter != null ? simpleCursorTreeAdapter.hashCode() : 0;
        SlidingDrawer slidingDrawer = this.AhwBna;
        int iHashCode7 = slidingDrawer != null ? slidingDrawer.hashCode() : 0;
        SimpleMonthView simpleMonthView = this.AYXKKw;
        int iHashCode8 = simpleMonthView != null ? simpleMonthView.hashCode() : 0;
        Switch r10 = this.djBIcL;
        int iHashCode9 = r10 != null ? r10.hashCode() : 0;
        TableLayout tableLayout = this.DbNXlk;
        int iHashCode10 = tableLayout != null ? tableLayout.hashCode() : 0;
        java.util.List<C> list2 = this.AkhnZx;
        int iHashCode11 = list2 != null ? list2.hashCode() : 0;
        C7450ak c7450ak = this.values;
        int iHashCode12 = c7450ak != null ? c7450ak.hashCode() : 0;
        C7556am c7556am = this.isConnected;
        int iHashCode13 = c7556am != null ? c7556am.hashCode() : 0;
        C8084aw c8084aw = this.fetchVPNInfo;
        int iHashCode14 = c8084aw != null ? c8084aw.hashCode() : 0;
        C27696k c27696k = this.fJNWhG;
        int iHashCode15 = c27696k != null ? c27696k.hashCode() : 0;
        C9940bf c9940bf = this.ejfBZ;
        int iHashCode16 = c9940bf != null ? c9940bf.hashCode() : 0;
        C9569bY c9569bY = this.fARcdN;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (c9569bY != null ? c9569bY.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmartSelectSprite.class != obj.getClass()) {
            return false;
        }
        SmartSelectSprite smartSelectSprite = (SmartSelectSprite) obj;
        return Intrinsics.EZpvd(this.KWHzl, smartSelectSprite.KWHzl) && Intrinsics.EZpvd(this.copydefault, smartSelectSprite.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, smartSelectSprite.AEQbTJ) && Intrinsics.copydefault(this.EZpvd, smartSelectSprite.EZpvd) && Intrinsics.EZpvd(this.valueOf, smartSelectSprite.valueOf) && Intrinsics.EZpvd(this.gEmmrt, smartSelectSprite.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, smartSelectSprite.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, smartSelectSprite.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, smartSelectSprite.djBIcL) && Intrinsics.EZpvd(this.DbNXlk, smartSelectSprite.DbNXlk) && Intrinsics.EZpvd(this.AkhnZx, smartSelectSprite.AkhnZx) && Intrinsics.EZpvd(this.values, smartSelectSprite.values) && Intrinsics.EZpvd(this.isConnected, smartSelectSprite.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, smartSelectSprite.fetchVPNInfo) && Intrinsics.EZpvd(this.fJNWhG, smartSelectSprite.fJNWhG) && Intrinsics.EZpvd(this.ejfBZ, smartSelectSprite.ejfBZ) && Intrinsics.EZpvd(this.fARcdN, smartSelectSprite.fARcdN);
    }

    public static /* synthetic */ SmartSelectSprite copy$default(SmartSelectSprite smartSelectSprite, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.FaceDetail$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SmartSelectSprite.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SmartSelectSprite.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(smartSelectSprite);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public WebViewFactory AEQbTJ;
        public SimpleCursorTreeAdapter AYXKKw;
        public TableLayout AhwBna;
        public C7450ak AkhnZx;
        public C9569bY AuCTel;
        public C8084aw DbNXlk;
        public java.util.List<SeekBar> EZpvd;
        public WebViewZygote KWHzl;
        public java.lang.Float OLrzqt;
        public WebSyncManager copydefault;
        public SimpleMonthView djBIcL;
        public C9940bf fARcdN;
        public C7556am fetchVPNInfo;
        public SlidingDrawer gEmmrt;
        public java.util.List<C> isConnected;
        public Switch valueOf;
        public C27696k values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewFactory AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(Switch r1) {
            this.valueOf = r1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(WebSyncManager webSyncManager) {
            this.copydefault = webSyncManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(WebViewFactory webViewFactory) {
            this.AEQbTJ = webViewFactory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C9940bf c9940bf) {
            this.fARcdN = c9940bf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SlidingDrawer AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleMonthView AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7450ak AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C> DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebSyncManager EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(TableLayout tableLayout) {
            this.AhwBna = tableLayout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WebViewZygote webViewZygote) {
            this.KWHzl = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C7556am c7556am) {
            this.fetchVPNInfo = c7556am;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C> list) {
            this.isConnected = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SimpleMonthView simpleMonthView) {
            this.djBIcL = simpleMonthView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C8084aw c8084aw) {
            this.DbNXlk = c8084aw;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SeekBar> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SimpleCursorTreeAdapter simpleCursorTreeAdapter) {
            this.AYXKKw = simpleCursorTreeAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SlidingDrawer slidingDrawer) {
            this.gEmmrt = slidingDrawer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C7450ak c7450ak) {
            this.AkhnZx = c7450ak;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C9569bY c9569bY) {
            this.AuCTel = c9569bY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C27696k c27696k) {
            this.values = c27696k;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SeekBar> djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C27696k ejfBZ() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9940bf fARcdN() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9569bY fIwbmz() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8084aw fJNWhG() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TableLayout fetchVPNInfo() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7556am isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleCursorTreeAdapter valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Switch values() {
            return this.valueOf;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SmartSelectSprite smartSelectSprite) {
            this();
            Intrinsics.checkNotNullParameter(smartSelectSprite, "");
            this.copydefault = smartSelectSprite.KWHzl();
            this.AEQbTJ = smartSelectSprite.AEQbTJ();
            this.KWHzl = smartSelectSprite.copydefault();
            this.OLrzqt = smartSelectSprite.EZpvd();
            this.EZpvd = smartSelectSprite.OLrzqt();
            this.AYXKKw = smartSelectSprite.djBIcL();
            this.gEmmrt = smartSelectSprite.AYXKKw();
            this.djBIcL = smartSelectSprite.AhwBna();
            this.valueOf = smartSelectSprite.valueOf();
            this.AhwBna = smartSelectSprite.gEmmrt();
            this.isConnected = smartSelectSprite.fetchVPNInfo();
            this.AkhnZx = smartSelectSprite.isConnected();
            this.fetchVPNInfo = smartSelectSprite.AkhnZx();
            this.DbNXlk = smartSelectSprite.DbNXlk();
            this.values = smartSelectSprite.values();
            this.fARcdN = smartSelectSprite.AuCTel();
            this.AuCTel = smartSelectSprite.fJNWhG();
        }

        public final SmartSelectSprite KWHzl() {
            return new SmartSelectSprite(this, null);
        }
    }
}
