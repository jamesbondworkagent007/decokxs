package o;

import com.okinc.im.usecase.messagelistmodel.ApplyRecalledMessageEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oET {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final C35847oFx AEQbTJ;
    public final C36576oda AYXKKw;
    public final android.content.Context EZpvd;
    public final oGD OLrzqt;
    public final oEL copydefault;
    public final oGK gEmmrt;
    public final oGE valueOf;

    @yCM
    public oET(@NotNull oGD ogd, @NotNull oGE oge, @NotNull oGK ogk, @NotNull oEL oel, @NotNull C35847oFx c35847oFx, @NotNull C36576oda c36576oda, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(oge, "");
        Intrinsics.checkNotNullParameter(ogk, "");
        Intrinsics.checkNotNullParameter(oel, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        Intrinsics.checkNotNullParameter(c36576oda, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ogd;
        this.valueOf = oge;
        this.gEmmrt = ogk;
        this.copydefault = oel;
        this.AEQbTJ = c35847oFx;
        this.AYXKKw = c36576oda;
        this.EZpvd = context;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oET.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.okinc.okimcore.model.im.OKReferenceMessage] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.okinc.okimcore.model.im.OKReferenceMessage] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.okinc.okimcore.model.im.OKMessageContent] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.oEL] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKReferenceMessage] */
    /* JADX WARN: Type inference failed for: r3v19, types: [o.oEL] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.okinc.okimcore.model.im.OKMessage] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.okinc.okimcore.model.im.OKMessage] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x03e5 -> B:111:0x03ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x03f5 -> B:114:0x040a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x03fe -> B:114:0x040a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull C44464sQu c44464sQu, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyRecalledMessageEventToMessageListModelUseCase$execute$1 applyRecalledMessageEventToMessageListModelUseCase$execute$1;
        OKUserInfo oKUserInfo;
        int i;
        java.lang.Object objEZpvd;
        oET oet;
        int i2;
        java.lang.Long l;
        C35254nrp c35254nrp;
        java.util.List<C35254nrp> list;
        OKRecallNotificationMessage oKRecallNotificationMessage;
        OKMessage oKMessage;
        C36558odI c36558odI2;
        java.lang.Object objCopy;
        C36558odI c36558odI3;
        java.util.List<C35254nrp> list2;
        java.lang.Long l2;
        OKMessage oKMessage2;
        oET oet2;
        OKRecallNotificationMessage oKRecallNotificationMessage2;
        OKRecallNotificationMessage oKRecallNotificationMessage3;
        java.util.List<C35254nrp> listEZpvd;
        java.util.Iterator it;
        OKRecallNotificationMessage oKRecallNotificationMessage4;
        java.lang.Long l3;
        ApplyRecalledMessageEventToMessageListModelUseCase$execute$1 applyRecalledMessageEventToMessageListModelUseCase$execute$12;
        oET oet3;
        java.util.List<C35254nrp> list3;
        java.lang.Long l4;
        C36558odI c36558odI4;
        oET oet4;
        int i3;
        OKMessage oKMessage3;
        android.os.Parcelable parcelableCopy;
        ?? r1;
        if (continuation instanceof ApplyRecalledMessageEventToMessageListModelUseCase$execute$1) {
            applyRecalledMessageEventToMessageListModelUseCase$execute$1 = (ApplyRecalledMessageEventToMessageListModelUseCase$execute$1) continuation;
            int i4 = applyRecalledMessageEventToMessageListModelUseCase$execute$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                applyRecalledMessageEventToMessageListModelUseCase$execute$1.label = i4 - Integer.MIN_VALUE;
            } else {
                applyRecalledMessageEventToMessageListModelUseCase$execute$1 = new ApplyRecalledMessageEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = applyRecalledMessageEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = applyRecalledMessageEventToMessageListModelUseCase$execute$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessageAEQbTJ = c44464sQu.AEQbTJ();
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            OKRecallNotificationMessage oKRecallNotificationMessageEZpvd = c44464sQu.EZpvd();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) oKMessageAEQbTJ.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId());
            java.util.List<C35254nrp> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c36558odI.AEQbTJ());
            C35254nrp c35254nrpEZpvd = this.OLrzqt.EZpvd(listFJNWhG, oKMessageAEQbTJ.getSeq(), oKMessageAEQbTJ.getClientMessageId());
            int iAEQbTJ = this.valueOf.AEQbTJ(listFJNWhG, oKMessageAEQbTJ.getSeq(), oKMessageAEQbTJ.getClientMessageId());
            if (!zEZpvd || c35254nrpEZpvd == null || iAEQbTJ == -1) {
                return c36558odI;
            }
            OKMessageContent content = c35254nrpEZpvd.OLrzqt().getContent();
            OKHQVoiceMessage oKHQVoiceMessage = content instanceof OKHQVoiceMessage ? (OKHQVoiceMessage) content : null;
            if (Intrinsics.EZpvd(oKHQVoiceMessage != null ? C44169sFw.EZpvd(oKHQVoiceMessage, this.EZpvd) : null, this.AYXKKw.djBIcL()) && this.AYXKKw.AYXKKw()) {
                this.AYXKKw.AhwBna();
            }
            OKMessage oKMessageOLrzqt = c35254nrpEZpvd.OLrzqt();
            C35254nrp c35254nrpCopydefault = c35254nrpEZpvd.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrpEZpvd.AYXKKw : oKMessageOLrzqt.copy((262143 & 1) != 0 ? oKMessageOLrzqt.seq : 0L, (262143 & 2) != 0 ? oKMessageOLrzqt.clientMessageId : null, (262143 & 4) != 0 ? oKMessageOLrzqt.targetId : null, (262143 & 8) != 0 ? oKMessageOLrzqt.senderUserId : null, (262143 & 16) != 0 ? oKMessageOLrzqt.messageType : null, (262143 & 32) != 0 ? oKMessageOLrzqt.conversationType : null, (262143 & 64) != 0 ? oKMessageOLrzqt.sentTime : 0L, (262143 & 128) != 0 ? oKMessageOLrzqt.receivedTime : 0L, (262143 & 256) != 0 ? oKMessageOLrzqt.extra : null, (262143 & 512) != 0 ? oKMessageOLrzqt.objectName : null, (262143 & 1024) != 0 ? oKMessageOLrzqt.messageDirection : null, (262143 & 2048) != 0 ? oKMessageOLrzqt.sentStatus : null, (262143 & 4096) != 0 ? oKMessageOLrzqt.content : null, (262143 & 8192) != 0 ? oKMessageOLrzqt.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessageOLrzqt.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessageOLrzqt.isVisible : false, (262143 & 65536) != 0 ? oKMessageOLrzqt.error : null, (262143 & 131072) != 0 ? oKMessageOLrzqt.reactionDisplay : null), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrpEZpvd.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrpEZpvd.values : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrpEZpvd.AhwBna : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrpEZpvd.valueOf : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrpEZpvd.djBIcL : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrpEZpvd.KWHzl : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrpEZpvd.copydefault : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrpEZpvd.OLrzqt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrpEZpvd.fJNWhG : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrpEZpvd.AuCTel : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrpEZpvd.isConnected : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrpEZpvd.AkhnZx : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrpEZpvd.DbNXlk : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrpEZpvd.fARcdN : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrpEZpvd.gEmmrt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrpEZpvd.fetchVPNInfo : 0);
            C35847oFx c35847oFx = this.AEQbTJ;
            OKMessage oKMessageOLrzqt2 = c35254nrpCopydefault.OLrzqt();
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0 = this;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1 = c36558odI;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2 = oKMessageAEQbTJ;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3 = lDjBIcL;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4 = oKRecallNotificationMessageEZpvd;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5 = listFJNWhG;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$6 = c35254nrpEZpvd;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.I$0 = iAEQbTJ;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.label = 1;
            oKUserInfo = null;
            i = 2;
            objEZpvd = c35847oFx.EZpvd(oKMessageOLrzqt2, (28 & 2) != 0 ? null : lDjBIcL, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, applyRecalledMessageEventToMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            oet = this;
            i2 = iAEQbTJ;
            l = lDjBIcL;
            c35254nrp = c35254nrpEZpvd;
            list = listFJNWhG;
            oKRecallNotificationMessage = oKRecallNotificationMessageEZpvd;
            oKMessage = oKMessageAEQbTJ;
            c36558odI2 = c36558odI;
        } else if (i5 == 1) {
            int i6 = applyRecalledMessageEventToMessageListModelUseCase$execute$1.I$0;
            c35254nrp = (C35254nrp) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$6;
            java.util.List<C35254nrp> list4 = (java.util.List) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5;
            OKRecallNotificationMessage oKRecallNotificationMessage5 = (OKRecallNotificationMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4;
            java.lang.Long l5 = (java.lang.Long) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3;
            OKMessage oKMessage4 = (OKMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI5 = (C36558odI) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1;
            oET oet5 = (oET) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            oKMessage = oKMessage4;
            oKUserInfo = null;
            i = 2;
            list = list4;
            oKRecallNotificationMessage = oKRecallNotificationMessage5;
            objEZpvd = obj;
            c36558odI2 = c36558odI5;
            oet = oet5;
            l = l5;
            i2 = i6;
        } else {
            if (i5 == 2) {
                list2 = (java.util.List) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5;
                oKRecallNotificationMessage2 = (OKRecallNotificationMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4;
                l2 = (java.lang.Long) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3;
                oKMessage2 = (OKMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2;
                c36558odI3 = (C36558odI) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1;
                oet2 = (oET) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                oKUserInfo = null;
                Unit unit = Unit.INSTANCE;
                list = list2;
                l = l2;
                oKMessage = oKMessage2;
                c36558odI2 = c36558odI3;
                oet = oet2;
                oKRecallNotificationMessage = oKRecallNotificationMessage2;
                listEZpvd = oet.gEmmrt.EZpvd(list, oKMessage.getSeq());
                if (!listEZpvd.isEmpty()) {
                    it = listEZpvd.iterator();
                    oKRecallNotificationMessage4 = oKRecallNotificationMessage;
                    l3 = l;
                    applyRecalledMessageEventToMessageListModelUseCase$execute$12 = applyRecalledMessageEventToMessageListModelUseCase$execute$1;
                    java.util.List<C35254nrp> list5 = list;
                    oet3 = oet;
                    list3 = list5;
                    while (it.hasNext()) {
                    }
                    list = list3;
                }
                C36558odI c36558odI6 = c36558odI2;
                return c36558odI6.AEQbTJ((32318 & 1) != 0 ? c36558odI6.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), (32318 & 2) != 0 ? c36558odI6.KWHzl : null, (32318 & 4) != 0 ? c36558odI6.DbNXlk : null, (32318 & 8) != 0 ? c36558odI6.AkhnZx : null, (32318 & 16) != 0 ? c36558odI6.isConnected : null, (32318 & 32) != 0 ? c36558odI6.djBIcL : null, (32318 & 64) != 0 ? c36558odI6.EZpvd : false, (32318 & 128) != 0 ? c36558odI6.OLrzqt : false, (32318 & 256) != 0 ? c36558odI6.values : null, (32318 & 512) != 0 ? c36558odI6.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI6.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI6.copydefault : null, (32318 & 4096) != 0 ? c36558odI6.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI6.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI6.valueOf : false);
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.util.Iterator it2 = (java.util.Iterator) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5;
                java.util.List<C35254nrp> list6 = (java.util.List) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4;
                OKRecallNotificationMessage oKRecallNotificationMessage6 = (OKRecallNotificationMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3;
                java.lang.Long l6 = (java.lang.Long) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2;
                C36558odI c36558odI7 = (C36558odI) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1;
                oET oet6 = (oET) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                oKUserInfo = null;
                applyRecalledMessageEventToMessageListModelUseCase$execute$12 = applyRecalledMessageEventToMessageListModelUseCase$execute$1;
                it = it2;
                list3 = list6;
                oKRecallNotificationMessage4 = oKRecallNotificationMessage6;
                c36558odI2 = c36558odI7;
                oet3 = oet6;
                l3 = l6;
                Unit unit2 = Unit.INSTANCE;
                while (it.hasNext()) {
                    C35254nrp c35254nrp2 = (C35254nrp) it.next();
                    android.os.Parcelable content2 = c35254nrp2.OLrzqt().getContent();
                    if ((content2 instanceof OKReferenceMessage ? (OKReferenceMessage) content2 : oKUserInfo) != null) {
                        int iAEQbTJ2 = oet3.valueOf.AEQbTJ(list3, c35254nrp2.OLrzqt().getSeq(), c35254nrp2.OLrzqt().getClientMessageId());
                        if (iAEQbTJ2 == -1) {
                            Unit unit22 = Unit.INSTANCE;
                            while (it.hasNext()) {
                            }
                        } else {
                            C35847oFx c35847oFx2 = oet3.AEQbTJ;
                            OKMessage oKMessageOLrzqt3 = c35254nrp2.OLrzqt();
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$0 = oet3;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$1 = c36558odI2;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$2 = l3;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$3 = oKRecallNotificationMessage4;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$4 = list3;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$5 = it;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$6 = oKUserInfo;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.I$0 = iAEQbTJ2;
                            applyRecalledMessageEventToMessageListModelUseCase$execute$12.label = 3;
                            java.lang.Long l7 = l3;
                            java.util.List<C35254nrp> list7 = list3;
                            oET oet7 = oet3;
                            java.lang.Object objEZpvd2 = c35847oFx2.EZpvd(oKMessageOLrzqt3, (28 & 2) != 0 ? null : l3, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, applyRecalledMessageEventToMessageListModelUseCase$execute$12);
                            if (objEZpvd2 == objCopydefault) {
                                return objCopydefault;
                            }
                            c36558odI4 = c36558odI2;
                            obj = objEZpvd2;
                            i3 = iAEQbTJ2;
                            l4 = l7;
                            oet4 = oet7;
                            list3 = list7;
                            oKMessage3 = (OKMessage) obj;
                            if (oKMessage3 == null) {
                                OKMessageContent content3 = oKMessage3.getContent();
                                ?? r12 = content3 instanceof OKReferenceMessage ? (OKReferenceMessage) content3 : oKUserInfo;
                                if (r12 != 0) {
                                    r12.setReferMsg(oKRecallNotificationMessage4);
                                    r1 = r12;
                                } else {
                                    r1 = oKUserInfo;
                                }
                                ?? oKReferenceMessage = new OKReferenceMessage();
                                oKReferenceMessage.setReferMsg(oKRecallNotificationMessage4);
                                oKReferenceMessage.setReferMsgUserId(r1 != 0 ? r1.getReferMsgUserId() : oKUserInfo);
                                oKReferenceMessage.setContent(r1 != 0 ? r1.getContent() : oKUserInfo);
                                oKReferenceMessage.setObjName(r1 != 0 ? r1.getObjName() : oKUserInfo);
                                oKReferenceMessage.setReferMsgUid(r1 != 0 ? r1.getReferMsgUid() : oKUserInfo);
                                oKReferenceMessage.setOriginalOKMessageContent(r1 != 0 ? r1.getOriginalOKMessageContent() : oKUserInfo);
                                Unit unit3 = Unit.INSTANCE;
                                parcelableCopy = oKMessage3.copy((262143 & 1) != 0 ? oKMessage3.seq : 0L, (262143 & 2) != 0 ? oKMessage3.clientMessageId : null, (262143 & 4) != 0 ? oKMessage3.targetId : null, (262143 & 8) != 0 ? oKMessage3.senderUserId : null, (262143 & 16) != 0 ? oKMessage3.messageType : null, (262143 & 32) != 0 ? oKMessage3.conversationType : null, (262143 & 64) != 0 ? oKMessage3.sentTime : 0L, (262143 & 128) != 0 ? oKMessage3.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage3.extra : null, (262143 & 512) != 0 ? oKMessage3.objectName : null, (262143 & 1024) != 0 ? oKMessage3.messageDirection : null, (262143 & 2048) != 0 ? oKMessage3.sentStatus : null, (262143 & 4096) != 0 ? oKMessage3.content : oKReferenceMessage, (262143 & 8192) != 0 ? oKMessage3.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage3.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage3.isVisible : false, (262143 & 65536) != 0 ? oKMessage3.error : null, (262143 & 131072) != 0 ? oKMessage3.reactionDisplay : null);
                            } else {
                                parcelableCopy = oKUserInfo;
                            }
                            if (parcelableCopy != null) {
                                c36558odI2 = c36558odI4;
                                l3 = l4;
                                oet3 = oet4;
                                Unit unit222 = Unit.INSTANCE;
                                while (it.hasNext()) {
                                }
                            } else {
                                ?? r2 = oet4.copydefault;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$0 = oet4;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$1 = c36558odI4;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$2 = l4;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$3 = oKRecallNotificationMessage4;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$4 = list3;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.L$5 = it;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12.label = 4;
                                oET oet8 = oet4;
                                ?? r7 = parcelableCopy;
                                C36558odI c36558odI8 = c36558odI4;
                                if (r2.copydefault(c36558odI4, false, list3, i3, r7, applyRecalledMessageEventToMessageListModelUseCase$execute$12) == objCopydefault) {
                                    return objCopydefault;
                                }
                                c36558odI7 = c36558odI8;
                                list6 = list3;
                                l6 = l4;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$1 = applyRecalledMessageEventToMessageListModelUseCase$execute$12;
                                it2 = it;
                                oKRecallNotificationMessage6 = oKRecallNotificationMessage4;
                                oet6 = oet8;
                                applyRecalledMessageEventToMessageListModelUseCase$execute$12 = applyRecalledMessageEventToMessageListModelUseCase$execute$1;
                                it = it2;
                                list3 = list6;
                                oKRecallNotificationMessage4 = oKRecallNotificationMessage6;
                                c36558odI2 = c36558odI7;
                                oet3 = oet6;
                                l3 = l6;
                                Unit unit2222 = Unit.INSTANCE;
                                while (it.hasNext()) {
                                }
                            }
                        }
                    }
                }
                list = list3;
                C36558odI c36558odI62 = c36558odI2;
                return c36558odI62.AEQbTJ((32318 & 1) != 0 ? c36558odI62.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), (32318 & 2) != 0 ? c36558odI62.KWHzl : null, (32318 & 4) != 0 ? c36558odI62.DbNXlk : null, (32318 & 8) != 0 ? c36558odI62.AkhnZx : null, (32318 & 16) != 0 ? c36558odI62.isConnected : null, (32318 & 32) != 0 ? c36558odI62.djBIcL : null, (32318 & 64) != 0 ? c36558odI62.EZpvd : false, (32318 & 128) != 0 ? c36558odI62.OLrzqt : false, (32318 & 256) != 0 ? c36558odI62.values : null, (32318 & 512) != 0 ? c36558odI62.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI62.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI62.copydefault : null, (32318 & 4096) != 0 ? c36558odI62.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI62.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI62.valueOf : false);
            }
            int i7 = applyRecalledMessageEventToMessageListModelUseCase$execute$1.I$0;
            java.util.Iterator it3 = (java.util.Iterator) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5;
            java.util.List<C35254nrp> list8 = (java.util.List) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4;
            OKRecallNotificationMessage oKRecallNotificationMessage7 = (OKRecallNotificationMessage) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3;
            java.lang.Long l8 = (java.lang.Long) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2;
            c36558odI4 = (C36558odI) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1;
            oET oet9 = (oET) applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            applyRecalledMessageEventToMessageListModelUseCase$execute$12 = applyRecalledMessageEventToMessageListModelUseCase$execute$1;
            it = it3;
            list3 = list8;
            oKUserInfo = null;
            oKRecallNotificationMessage4 = oKRecallNotificationMessage7;
            i3 = i7;
            l4 = l8;
            oet4 = oet9;
            oKMessage3 = (OKMessage) obj;
            if (oKMessage3 == null) {
            }
            if (parcelableCopy != null) {
            }
        }
        OKMessage oKMessage5 = (OKMessage) objEZpvd;
        if (oKMessage5 != null) {
            if (oKRecallNotificationMessage != null) {
                OKMessageContent content4 = c35254nrp.OLrzqt().getContent();
                oKRecallNotificationMessage.setUserInfo(content4 != null ? content4.getUserInfo() : oKUserInfo);
                Unit unit4 = Unit.INSTANCE;
                oKRecallNotificationMessage3 = oKRecallNotificationMessage;
            } else {
                oKRecallNotificationMessage3 = oKUserInfo;
            }
            objCopy = oKMessage5.copy((262143 & 1) != 0 ? oKMessage5.seq : 0L, (262143 & 2) != 0 ? oKMessage5.clientMessageId : null, (262143 & 4) != 0 ? oKMessage5.targetId : null, (262143 & 8) != 0 ? oKMessage5.senderUserId : null, (262143 & 16) != 0 ? oKMessage5.messageType : null, (262143 & 32) != 0 ? oKMessage5.conversationType : null, (262143 & 64) != 0 ? oKMessage5.sentTime : 0L, (262143 & 128) != 0 ? oKMessage5.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage5.extra : null, (262143 & 512) != 0 ? oKMessage5.objectName : null, (262143 & 1024) != 0 ? oKMessage5.messageDirection : null, (262143 & 2048) != 0 ? oKMessage5.sentStatus : null, (262143 & 4096) != 0 ? oKMessage5.content : oKRecallNotificationMessage3, (262143 & 8192) != 0 ? oKMessage5.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage5.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage5.isVisible : false, (262143 & 65536) != 0 ? oKMessage5.error : null, (262143 & 131072) != 0 ? oKMessage5.reactionDisplay : null);
        } else {
            objCopy = oKUserInfo;
        }
        if (objCopy != null) {
            ?? r3 = oet.copydefault;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$0 = oet;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$2 = oKMessage;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$3 = l;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$4 = oKRecallNotificationMessage;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$5 = list;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.L$6 = oKUserInfo;
            applyRecalledMessageEventToMessageListModelUseCase$execute$1.label = i;
            OKRecallNotificationMessage oKRecallNotificationMessage8 = oKRecallNotificationMessage;
            oET oet10 = oet;
            if (r3.copydefault(c36558odI2, false, list, i2, objCopy, applyRecalledMessageEventToMessageListModelUseCase$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            c36558odI3 = c36558odI2;
            list2 = list;
            l2 = l;
            oKMessage2 = oKMessage;
            oet2 = oet10;
            oKRecallNotificationMessage2 = oKRecallNotificationMessage8;
            Unit unit5 = Unit.INSTANCE;
            list = list2;
            l = l2;
            oKMessage = oKMessage2;
            c36558odI2 = c36558odI3;
            oet = oet2;
            oKRecallNotificationMessage = oKRecallNotificationMessage2;
            listEZpvd = oet.gEmmrt.EZpvd(list, oKMessage.getSeq());
            if (!listEZpvd.isEmpty()) {
            }
            C36558odI c36558odI622 = c36558odI2;
            return c36558odI622.AEQbTJ((32318 & 1) != 0 ? c36558odI622.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), (32318 & 2) != 0 ? c36558odI622.KWHzl : null, (32318 & 4) != 0 ? c36558odI622.DbNXlk : null, (32318 & 8) != 0 ? c36558odI622.AkhnZx : null, (32318 & 16) != 0 ? c36558odI622.isConnected : null, (32318 & 32) != 0 ? c36558odI622.djBIcL : null, (32318 & 64) != 0 ? c36558odI622.EZpvd : false, (32318 & 128) != 0 ? c36558odI622.OLrzqt : false, (32318 & 256) != 0 ? c36558odI622.values : null, (32318 & 512) != 0 ? c36558odI622.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI622.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI622.copydefault : null, (32318 & 4096) != 0 ? c36558odI622.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI622.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI622.valueOf : false);
        }
        listEZpvd = oet.gEmmrt.EZpvd(list, oKMessage.getSeq());
        if (!listEZpvd.isEmpty()) {
        }
        C36558odI c36558odI6222 = c36558odI2;
        return c36558odI6222.AEQbTJ((32318 & 1) != 0 ? c36558odI6222.AhwBna : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), (32318 & 2) != 0 ? c36558odI6222.KWHzl : null, (32318 & 4) != 0 ? c36558odI6222.DbNXlk : null, (32318 & 8) != 0 ? c36558odI6222.AkhnZx : null, (32318 & 16) != 0 ? c36558odI6222.isConnected : null, (32318 & 32) != 0 ? c36558odI6222.djBIcL : null, (32318 & 64) != 0 ? c36558odI6222.EZpvd : false, (32318 & 128) != 0 ? c36558odI6222.OLrzqt : false, (32318 & 256) != 0 ? c36558odI6222.values : null, (32318 & 512) != 0 ? c36558odI6222.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI6222.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI6222.copydefault : null, (32318 & 4096) != 0 ? c36558odI6222.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI6222.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI6222.valueOf : false);
    }
}
