package o;

import com.okinc.im.message.MessageClusterType;
import com.okinc.im.usecase.uiMessage.BuildUiMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36517ocU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oGH {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C36517ocU AEQbTJ;
    public final C35809oEm AYXKKw;
    public final C36576oda AhwBna;
    public final android.content.Context EZpvd;
    public final C35803oEg KWHzl;
    public final C35801oEe OLrzqt;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.SentStatus.values().length];
            try {
                iArr[OKMessage.SentStatus.SENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.SentStatus.READ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKMessage.SentStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKMessage.SentStatus.CANCELED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKMessage.SentStatus.SENDING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public oGH(@NotNull C36576oda c36576oda, @NotNull C36517ocU c36517ocU, @NotNull C35803oEg c35803oEg, @NotNull C35809oEm c35809oEm, @NotNull C35801oEe c35801oEe, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(c36576oda, "");
        Intrinsics.checkNotNullParameter(c36517ocU, "");
        Intrinsics.checkNotNullParameter(c35803oEg, "");
        Intrinsics.checkNotNullParameter(c35809oEm, "");
        Intrinsics.checkNotNullParameter(c35801oEe, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = c36576oda;
        this.AEQbTJ = c36517ocU;
        this.KWHzl = c35803oEg;
        this.AYXKKw = c35809oEm;
        this.OLrzqt = c35801oEe;
        this.EZpvd = context;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull OKMessage oKMessage, @NotNull java.util.List<OKMessage> list, java.lang.Long l, java.lang.String str, java.lang.Boolean bool, java.lang.Long l2, java.lang.Long l3, java.lang.Integer num, java.lang.Boolean bool2, @NotNull Continuation<? super C35254nrp> continuation) throws java.lang.Throwable {
        BuildUiMessageUseCase$execute$1 buildUiMessageUseCase$execute$1;
        int i;
        long jIntValue;
        int i2;
        java.lang.String str2;
        java.lang.String strCopydefault;
        int iDp2px$default;
        int i3;
        java.util.List<OKMessage> list2;
        int i4;
        boolean zAEQbTJ;
        java.lang.String str3;
        java.lang.Object objEZpvd;
        java.lang.String str4;
        OKMessage oKMessage2;
        int i5;
        MessageClusterType messageClusterType;
        C35254nrp c35254nrp;
        java.lang.Integer num2;
        int i6;
        java.lang.Integer num3;
        java.lang.String str5;
        boolean z;
        java.lang.String str6;
        java.lang.Long l4;
        java.lang.Integer num4;
        java.lang.Object obj;
        int i7;
        java.lang.Boolean bool3;
        java.lang.Long l5;
        if (continuation instanceof BuildUiMessageUseCase$execute$1) {
            buildUiMessageUseCase$execute$1 = (BuildUiMessageUseCase$execute$1) continuation;
            int i8 = buildUiMessageUseCase$execute$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                buildUiMessageUseCase$execute$1.label = i8 - Integer.MIN_VALUE;
            } else {
                buildUiMessageUseCase$execute$1 = new BuildUiMessageUseCase$execute$1(this, continuation);
            }
        }
        BuildUiMessageUseCase$execute$1 buildUiMessageUseCase$execute$12 = buildUiMessageUseCase$execute$1;
        java.lang.Object obj2 = buildUiMessageUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i9 = buildUiMessageUseCase$execute$12.label;
        if (i9 == 0) {
            C56391yDq.AEQbTJ(obj2);
            java.util.Iterator<OKMessage> it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getSeq() == oKMessage.getSeq()) {
                    i = i10;
                    break;
                }
                i10++;
            }
            boolean z2 = false;
            int i11 = i;
            C35254nrp c35254nrp2 = new C35254nrp(oKMessage, false, 0, false, null, null, null, null, z2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, null, z2, 0, 131070, null);
            C36517ocU.StateListAnimator stateListAnimatorCopydefault = this.AEQbTJ.copydefault(oKMessage);
            C35249nrk c35249nrkAEQbTJ = this.AhwBna.AEQbTJ(oKMessage);
            OKMessageContent content = oKMessage.getContent();
            OKMessageContent originalOKMessageContent = content instanceof OKReferenceMessage ? ((OKReferenceMessage) content).getOriginalOKMessageContent() : oKMessage.getContent();
            OKHQVoiceMessage oKHQVoiceMessage = originalOKMessageContent instanceof OKHQVoiceMessage ? (OKHQVoiceMessage) originalOKMessageContent : null;
            java.lang.Integer numAEQbTJ = oKHQVoiceMessage != null ? C56443yFo.AEQbTJ(oKHQVoiceMessage.getDuration()) : null;
            int iKWHzl = 2;
            boolean zKWHzl = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt(C56443yFo.AEQbTJ(2), C56443yFo.AEQbTJ(4))), c35249nrkAEQbTJ != null ? C56443yFo.AEQbTJ(c35249nrkAEQbTJ.OLrzqt()) : null);
            if (numAEQbTJ == null || c35249nrkAEQbTJ == null) {
                jIntValue = 0;
            } else {
                jIntValue = (long) (numAEQbTJ.intValue() * 1000 * (zKWHzl ? c35249nrkAEQbTJ.EZpvd() : 1.0f));
            }
            java.lang.Integer numAEQbTJ2 = c35249nrkAEQbTJ != null ? C56443yFo.AEQbTJ((int) (c35249nrkAEQbTJ.EZpvd() * 100)) : null;
            pUU.EZpvd("BuildUiMessageUseCase", "execute: [" + oKMessage.getSeq() + "]: downloadStatus:" + stateListAnimatorCopydefault + ", playStatus:" + c35249nrkAEQbTJ + ", voiceTotalDuration:" + numAEQbTJ + ", voiceRemainDuration:" + jIntValue);
            nDD ndd = nDD.OLrzqt;
            java.lang.String strCopydefault2 = ndd.copydefault(jIntValue);
            if (c35249nrkAEQbTJ == null || c35249nrkAEQbTJ.OLrzqt() != 6) {
                if (c35249nrkAEQbTJ != null && c35249nrkAEQbTJ.OLrzqt() == 7) {
                    i2 = 1;
                } else if (stateListAnimatorCopydefault == null || stateListAnimatorCopydefault.OLrzqt() != 2) {
                    if (stateListAnimatorCopydefault != null) {
                        i2 = 1;
                        if (stateListAnimatorCopydefault.OLrzqt() != 1) {
                        }
                        if (numAEQbTJ != null) {
                            str2 = "BuildUiMessageUseCase";
                            strCopydefault = ndd.copydefault(0L);
                        } else {
                            str2 = "BuildUiMessageUseCase";
                            if (zKWHzl) {
                                strCopydefault = strCopydefault2 + " / " + ndd.copydefault(numAEQbTJ.intValue() * 1000);
                            } else {
                                strCopydefault = ndd.copydefault(numAEQbTJ.intValue() * 1000);
                            }
                        }
                        int iEZpvd = C35254nrp.Companion.EZpvd(c35249nrkAEQbTJ);
                        if (numAEQbTJ == null) {
                            numAEQbTJ.intValue();
                            iDp2px$default = C55298xhM.dp2px$default(C44157sFk.copydefault(), null, i2, null);
                        } else {
                            iDp2px$default = C55298xhM.dp2px$default(140.0f, null, i2, null);
                        }
                        i3 = (l2 != null && oKMessage.getSeq() == l2.longValue()) ? i2 : 0;
                        if (bool2 == null) {
                            zAEQbTJ = bool2.booleanValue();
                            list2 = list;
                            i4 = i11;
                        } else {
                            list2 = list;
                            i4 = i11;
                            zAEQbTJ = this.KWHzl.AEQbTJ(i4, oKMessage, list2);
                        }
                        MessageClusterType messageClusterTypeAEQbTJ = this.AYXKKw.AEQbTJ(i4, oKMessage, list2);
                        C35801oEe c35801oEe = this.OLrzqt;
                        buildUiMessageUseCase$execute$12.L$0 = oKMessage;
                        str3 = "execute: [";
                        buildUiMessageUseCase$execute$12.L$1 = l;
                        buildUiMessageUseCase$execute$12.L$2 = str;
                        buildUiMessageUseCase$execute$12.L$3 = bool;
                        buildUiMessageUseCase$execute$12.L$4 = l3;
                        buildUiMessageUseCase$execute$12.L$5 = num;
                        buildUiMessageUseCase$execute$12.L$6 = c35254nrp2;
                        buildUiMessageUseCase$execute$12.L$7 = numAEQbTJ;
                        buildUiMessageUseCase$execute$12.L$8 = numAEQbTJ2;
                        buildUiMessageUseCase$execute$12.L$9 = strCopydefault2;
                        buildUiMessageUseCase$execute$12.L$10 = strCopydefault;
                        buildUiMessageUseCase$execute$12.L$11 = messageClusterTypeAEQbTJ;
                        buildUiMessageUseCase$execute$12.I$0 = iEZpvd;
                        buildUiMessageUseCase$execute$12.I$1 = iDp2px$default;
                        buildUiMessageUseCase$execute$12.I$2 = iKWHzl;
                        buildUiMessageUseCase$execute$12.Z$0 = zAEQbTJ;
                        buildUiMessageUseCase$execute$12.I$3 = i3;
                        java.lang.String str7 = strCopydefault;
                        buildUiMessageUseCase$execute$12.label = 1;
                        objEZpvd = c35801oEe.EZpvd(i4, oKMessage, list2, buildUiMessageUseCase$execute$12);
                        if (objEZpvd != objCopydefault) {
                            return objCopydefault;
                        }
                        str4 = str;
                        oKMessage2 = oKMessage;
                        i5 = iDp2px$default;
                        messageClusterType = messageClusterTypeAEQbTJ;
                        c35254nrp = c35254nrp2;
                        num2 = numAEQbTJ2;
                        i6 = iKWHzl;
                        num3 = numAEQbTJ;
                        str5 = strCopydefault2;
                        z = zAEQbTJ;
                        str6 = str7;
                        l4 = l;
                        num4 = num;
                        obj = objEZpvd;
                        i7 = iEZpvd;
                        bool3 = bool;
                        l5 = l3;
                    } else {
                        i2 = 1;
                    }
                    if (stateListAnimatorCopydefault == null || stateListAnimatorCopydefault.OLrzqt() != 4) {
                        OKMessage.SentStatus sentStatus = oKMessage.getSentStatus();
                        int i12 = sentStatus != null ? TaskDescription.KWHzl[sentStatus.ordinal()] : -1;
                        if (i12 == i2 || i12 == 2) {
                            iKWHzl = 0;
                        } else if (i12 == 3) {
                            iKWHzl = i2;
                        } else if (i12 == 4) {
                            iKWHzl = 3;
                        } else if (i12 != 5) {
                            iKWHzl = c35254nrp2.KWHzl();
                        }
                    }
                    if (numAEQbTJ != null) {
                    }
                    int iEZpvd2 = C35254nrp.Companion.EZpvd(c35249nrkAEQbTJ);
                    if (numAEQbTJ == null) {
                    }
                    if (l2 != null) {
                        if (bool2 == null) {
                        }
                        MessageClusterType messageClusterTypeAEQbTJ2 = this.AYXKKw.AEQbTJ(i4, oKMessage, list2);
                        C35801oEe c35801oEe2 = this.OLrzqt;
                        buildUiMessageUseCase$execute$12.L$0 = oKMessage;
                        str3 = "execute: [";
                        buildUiMessageUseCase$execute$12.L$1 = l;
                        buildUiMessageUseCase$execute$12.L$2 = str;
                        buildUiMessageUseCase$execute$12.L$3 = bool;
                        buildUiMessageUseCase$execute$12.L$4 = l3;
                        buildUiMessageUseCase$execute$12.L$5 = num;
                        buildUiMessageUseCase$execute$12.L$6 = c35254nrp2;
                        buildUiMessageUseCase$execute$12.L$7 = numAEQbTJ;
                        buildUiMessageUseCase$execute$12.L$8 = numAEQbTJ2;
                        buildUiMessageUseCase$execute$12.L$9 = strCopydefault2;
                        buildUiMessageUseCase$execute$12.L$10 = strCopydefault;
                        buildUiMessageUseCase$execute$12.L$11 = messageClusterTypeAEQbTJ2;
                        buildUiMessageUseCase$execute$12.I$0 = iEZpvd2;
                        buildUiMessageUseCase$execute$12.I$1 = iDp2px$default;
                        buildUiMessageUseCase$execute$12.I$2 = iKWHzl;
                        buildUiMessageUseCase$execute$12.Z$0 = zAEQbTJ;
                        buildUiMessageUseCase$execute$12.I$3 = i3;
                        java.lang.String str72 = strCopydefault;
                        buildUiMessageUseCase$execute$12.label = 1;
                        objEZpvd = c35801oEe2.EZpvd(i4, oKMessage, list2, buildUiMessageUseCase$execute$12);
                        if (objEZpvd != objCopydefault) {
                        }
                    }
                } else {
                    iKWHzl = 4;
                }
                iKWHzl = 6;
                if (numAEQbTJ != null) {
                }
                int iEZpvd22 = C35254nrp.Companion.EZpvd(c35249nrkAEQbTJ);
                if (numAEQbTJ == null) {
                }
                if (l2 != null) {
                }
            } else {
                iKWHzl = 5;
            }
            i2 = 1;
            if (numAEQbTJ != null) {
            }
            int iEZpvd222 = C35254nrp.Companion.EZpvd(c35249nrkAEQbTJ);
            if (numAEQbTJ == null) {
            }
            if (l2 != null) {
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = buildUiMessageUseCase$execute$12.I$3;
            boolean z3 = buildUiMessageUseCase$execute$12.Z$0;
            int i14 = buildUiMessageUseCase$execute$12.I$2;
            int i15 = buildUiMessageUseCase$execute$12.I$1;
            i7 = buildUiMessageUseCase$execute$12.I$0;
            MessageClusterType messageClusterType2 = (MessageClusterType) buildUiMessageUseCase$execute$12.L$11;
            java.lang.String str8 = (java.lang.String) buildUiMessageUseCase$execute$12.L$10;
            java.lang.String str9 = (java.lang.String) buildUiMessageUseCase$execute$12.L$9;
            java.lang.Integer num5 = (java.lang.Integer) buildUiMessageUseCase$execute$12.L$8;
            java.lang.Integer num6 = (java.lang.Integer) buildUiMessageUseCase$execute$12.L$7;
            C35254nrp c35254nrp3 = (C35254nrp) buildUiMessageUseCase$execute$12.L$6;
            java.lang.Integer num7 = (java.lang.Integer) buildUiMessageUseCase$execute$12.L$5;
            java.lang.Long l6 = (java.lang.Long) buildUiMessageUseCase$execute$12.L$4;
            java.lang.Boolean bool4 = (java.lang.Boolean) buildUiMessageUseCase$execute$12.L$3;
            java.lang.String str10 = (java.lang.String) buildUiMessageUseCase$execute$12.L$2;
            l4 = (java.lang.Long) buildUiMessageUseCase$execute$12.L$1;
            oKMessage2 = (OKMessage) buildUiMessageUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            str4 = str10;
            z = z3;
            i6 = i14;
            i5 = i15;
            messageClusterType = messageClusterType2;
            str6 = str8;
            num3 = num6;
            c35254nrp = c35254nrp3;
            str3 = "execute: [";
            str2 = "BuildUiMessageUseCase";
            str5 = str9;
            num2 = num5;
            i3 = i13;
            num4 = num7;
            l5 = l6;
            obj = obj2;
            bool3 = bool4;
        }
        C35254nrp c35254nrpCopydefault = c35254nrp.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrp.AYXKKw : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrp.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrp.values : i6, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrp.AhwBna : i3 != 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrp.valueOf : messageClusterType, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrp.djBIcL : C56443yFo.KWHzl(((java.lang.Boolean) obj).booleanValue()), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrp.KWHzl : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrp.copydefault : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrp.OLrzqt : z, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrp.fJNWhG : num3, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrp.AuCTel : str5, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrp.isConnected : str6, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrp.AkhnZx : C56443yFo.AEQbTJ(i7), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrp.DbNXlk : i5, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrp.fARcdN : num2, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrp.gEmmrt : l5 != null && C33129mqd.valueOf(C56443yFo.KWHzl(oKMessage2.getSeq())) == l5.longValue(), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrp.fetchVPNInfo : num4 != null ? num4.intValue() : 0);
        if (l4 != null && str4 != null) {
            c35254nrpCopydefault = c35254nrpCopydefault.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrpCopydefault.AYXKKw : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrpCopydefault.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrpCopydefault.values : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrpCopydefault.AhwBna : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrpCopydefault.valueOf : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrpCopydefault.djBIcL : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrpCopydefault.KWHzl : l4.longValue() == oKMessage2.getSeq() ? str4 : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrpCopydefault.copydefault : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrpCopydefault.OLrzqt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrpCopydefault.fJNWhG : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrpCopydefault.AuCTel : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrpCopydefault.isConnected : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrpCopydefault.AkhnZx : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrpCopydefault.DbNXlk : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrpCopydefault.fARcdN : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrpCopydefault.gEmmrt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrpCopydefault.fetchVPNInfo : 0);
        }
        C35254nrp c35254nrpCopydefault2 = c35254nrpCopydefault;
        if (Intrinsics.EZpvd(bool3, C56443yFo.KWHzl(true)) && l4 != null) {
            c35254nrpCopydefault2 = c35254nrpCopydefault2.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrpCopydefault2.AYXKKw : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrpCopydefault2.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrpCopydefault2.values : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrpCopydefault2.AhwBna : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrpCopydefault2.valueOf : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrpCopydefault2.djBIcL : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrpCopydefault2.KWHzl : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrpCopydefault2.copydefault : C56443yFo.KWHzl(oKMessage2.getSeq() == l4.longValue()), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrpCopydefault2.OLrzqt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrpCopydefault2.fJNWhG : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrpCopydefault2.AuCTel : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrpCopydefault2.isConnected : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrpCopydefault2.AkhnZx : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrpCopydefault2.DbNXlk : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrpCopydefault2.fARcdN : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrpCopydefault2.gEmmrt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrpCopydefault2.fetchVPNInfo : 0);
        }
        pUU.EZpvd(str2, str3 + c35254nrpCopydefault2.OLrzqt().getSeq() + "]: sentStatus:" + c35254nrpCopydefault2.OLrzqt().getSentStatus() + ", state:" + c35254nrpCopydefault2.KWHzl() + ", isShowMessageSendStatus:" + c35254nrpCopydefault2.DbNXlk());
        return c35254nrpCopydefault2;
    }
}
