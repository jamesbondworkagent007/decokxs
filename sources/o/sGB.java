package o;

import com.okinc.okimcore.feature.conversation.listener.RefreshEvent;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$changeContactNoDisturbStatus$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$deleteInHouseConversation$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getAnnouncementBannerAsResult$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationCountWithoutNotificationFlow$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationFlow$2;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationTotalCountFlow$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationUnreadCount$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationUnreadCountFlow$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationsByPage$$inlined$map$1$2$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getConversationsByPage$3;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getTotalUnreadCount$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getTotalUnreadCountByChannelTypeFlow$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$getTotalUnreadCountFlow$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$initConversationByRelationId$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$markConversationMessagesRead$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$markConversationRead$1;
import com.okinc.okimcore.feature.conversation.manager.ConversationManager$modifyGroupConversationNoDisturbSetting$1;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.other.IMSource;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.sGF;
import o.sNF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sGB implements sGF, sEH {
    public final sFU AEQbTJ;
    public final sGH OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sGH
    public void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.OLrzqt.AEQbTJ(oKConversation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sGH
    public void AEQbTJ(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ(oKConversationType, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sGH
    public void AEQbTJ(boolean z) {
        this.OLrzqt.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sGH
    public void KWHzl(@NotNull RefreshEvent refreshEvent, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(refreshEvent, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.OLrzqt.KWHzl(refreshEvent, oKConversation);
    }

    @Override // o.sEH
    public void bp_() {
    }

    @yCM
    public sGB(@NotNull sFU sfu, @NotNull sGH sgh) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(sgh, "");
        this.AEQbTJ = sfu;
        this.OLrzqt = sgh;
    }

    private final sHZ gEmmrt() {
        return sDZ.AEQbTJ.AhwBna();
    }

    @Override // o.sEH
    public void bq_() {
        C44196sGw.copydefault.AEQbTJ();
        sGJ.copydefault.EZpvd().clear();
    }

    @Override // o.sGF
    public java.lang.Object KWHzl(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, boolean z, boolean z2, java.lang.String str2, @NotNull Continuation<? super OKConversation> continuation) {
        return gEmmrt().EZpvd().AEQbTJ(oKConversationType, str, z, z2 ? CacheStrategy.CacheFirst : CacheStrategy.ForceRemote, str2, continuation);
    }

    @Override // o.sGF
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super OKConversation> continuation) {
        return gEmmrt().EZpvd().AEQbTJ(str, cacheStrategy, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull RelationSourceType relationSourceType, java.lang.String str2, @NotNull Continuation<? super Result<OKConversation>> continuation) throws java.lang.Throwable {
        ConversationManager$initConversationByRelationId$1 conversationManager$initConversationByRelationId$1;
        if (continuation instanceof ConversationManager$initConversationByRelationId$1) {
            conversationManager$initConversationByRelationId$1 = (ConversationManager$initConversationByRelationId$1) continuation;
            int i = conversationManager$initConversationByRelationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$initConversationByRelationId$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$initConversationByRelationId$1 = new ConversationManager$initConversationByRelationId$1(this, continuation);
            }
        }
        java.lang.Object obj = conversationManager$initConversationByRelationId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$initConversationByRelationId$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC44375sNm interfaceC44375sNmEZpvd = gEmmrt().EZpvd();
        conversationManager$initConversationByRelationId$1.label = 1;
        java.lang.Object objAEQbTJ = interfaceC44375sNmEZpvd.AEQbTJ(str, relationSourceType, str2, conversationManager$initConversationByRelationId$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    @Override // o.sGF
    public java.lang.Object AEQbTJ(int i, boolean z, boolean z2, boolean z3, @NotNull Continuation<? super Flow<? extends Result<? extends java.util.List<OKConversation>>>> continuation) {
        return FlowKt.m7441catch(new StateListAnimator(gEmmrt().EZpvd().AEQbTJ(i, z, z2, z3)), new ConversationManager$getConversationsByPage$3(null));
    }

    @Override // o.sGF
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation) {
        return gEmmrt().EZpvd().AYXKKw();
    }

    public static final class ActionBar implements Flow<Result<? extends java.util.List<? extends OKConversation>>> {
        public final /* synthetic */ Flow AEQbTJ;

        public ActionBar(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super Result<? extends java.util.List<? extends OKConversation>>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGB$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                ConversationManager$getConversationFlow$$inlined$map$1$2$1 conversationManager$getConversationFlow$$inlined$map$1$2$1;
                if (continuation instanceof ConversationManager$getConversationFlow$$inlined$map$1$2$1) {
                    conversationManager$getConversationFlow$$inlined$map$1$2$1 = (ConversationManager$getConversationFlow$$inlined$map$1$2$1) continuation;
                    int i = conversationManager$getConversationFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        conversationManager$getConversationFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        conversationManager$getConversationFlow$$inlined$map$1$2$1 = new ConversationManager$getConversationFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = conversationManager$getConversationFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = conversationManager$getConversationFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl((java.util.List) obj));
                    conversationManager$getConversationFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(resultM7376boximpl, conversationManager$getConversationFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator implements Flow<Result<? extends java.util.List<? extends OKConversation>>> {
        public final /* synthetic */ Flow copydefault;

        public StateListAnimator(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super Result<? extends java.util.List<? extends OKConversation>>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sGB$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                ConversationManager$getConversationsByPage$$inlined$map$1$2$1 conversationManager$getConversationsByPage$$inlined$map$1$2$1;
                if (continuation instanceof ConversationManager$getConversationsByPage$$inlined$map$1$2$1) {
                    conversationManager$getConversationsByPage$$inlined$map$1$2$1 = (ConversationManager$getConversationsByPage$$inlined$map$1$2$1) continuation;
                    int i = conversationManager$getConversationsByPage$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        conversationManager$getConversationsByPage$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        conversationManager$getConversationsByPage$$inlined$map$1$2$1 = new ConversationManager$getConversationsByPage$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = conversationManager$getConversationsByPage$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = conversationManager$getConversationsByPage$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Result.Application application = Result.Companion;
                    Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl((java.util.List) obj));
                    conversationManager$getConversationsByPage$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(resultM7376boximpl, conversationManager$getConversationsByPage$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // o.sGF
    public java.lang.Object KWHzl(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation) {
        return gEmmrt().EZpvd().djBIcL();
    }

    @Override // o.sGF
    public java.lang.Object copydefault(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation) {
        return gEmmrt().EZpvd().EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super sNF.Application> continuation) throws java.lang.Throwable {
        ConversationManager$modifyGroupConversationNoDisturbSetting$1 conversationManager$modifyGroupConversationNoDisturbSetting$1;
        sGB sgb;
        if (continuation instanceof ConversationManager$modifyGroupConversationNoDisturbSetting$1) {
            conversationManager$modifyGroupConversationNoDisturbSetting$1 = (ConversationManager$modifyGroupConversationNoDisturbSetting$1) continuation;
            int i = conversationManager$modifyGroupConversationNoDisturbSetting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$modifyGroupConversationNoDisturbSetting$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$modifyGroupConversationNoDisturbSetting$1 = new ConversationManager$modifyGroupConversationNoDisturbSetting$1(this, continuation);
            }
        }
        java.lang.Object conversation$default = conversationManager$modifyGroupConversationNoDisturbSetting$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$modifyGroupConversationNoDisturbSetting$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(conversation$default);
            OKConversationType oKConversationType = OKConversationType.GROUP;
            conversationManager$modifyGroupConversationNoDisturbSetting$1.L$0 = this;
            conversationManager$modifyGroupConversationNoDisturbSetting$1.Z$0 = z;
            conversationManager$modifyGroupConversationNoDisturbSetting$1.label = 1;
            conversation$default = sGF.Activity.getConversation$default(this, oKConversationType, str, true, false, null, conversationManager$modifyGroupConversationNoDisturbSetting$1, 24, null);
            if (conversation$default == objCopydefault) {
                return objCopydefault;
            }
            sgb = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(conversation$default);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = conversationManager$modifyGroupConversationNoDisturbSetting$1.Z$0;
            sgb = (sGB) conversationManager$modifyGroupConversationNoDisturbSetting$1.L$0;
            C56391yDq.AEQbTJ(conversation$default);
        }
        conversationManager$modifyGroupConversationNoDisturbSetting$1.L$0 = null;
        conversationManager$modifyGroupConversationNoDisturbSetting$1.label = 2;
        conversation$default = sgb.AEQbTJ((OKConversation) conversation$default, z, conversationManager$modifyGroupConversationNoDisturbSetting$1);
        return conversation$default == objCopydefault ? objCopydefault : conversation$default;
    }

    @Override // o.sGF
    public OKConversation OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.copydefault(str);
    }

    @Override // o.sGF
    public void EZpvd(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.AEQbTJ.AEQbTJ(oKConversation);
    }

    @Override // o.sGF
    public java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = gEmmrt().OLrzqt().OLrzqt(oKConversation, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        ConversationManager$deleteInHouseConversation$1 conversationManager$deleteInHouseConversation$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$deleteInHouseConversation$1) {
            conversationManager$deleteInHouseConversation$1 = (ConversationManager$deleteInHouseConversation$1) continuation;
            int i = conversationManager$deleteInHouseConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$deleteInHouseConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$deleteInHouseConversation$1 = new ConversationManager$deleteInHouseConversation$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = conversationManager$deleteInHouseConversation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$deleteInHouseConversation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                C44124sEe.imLogConversation$default("deleteInHouseConversation => channelId:" + oKConversation.getTargetId(), null, 2, null);
                InterfaceC44282sKa interfaceC44282sKaOLrzqt = gEmmrt().OLrzqt();
                conversationManager$deleteInHouseConversation$1.label = 1;
                objKWHzl = interfaceC44282sKaOLrzqt.KWHzl(oKConversation, conversationManager$deleteInHouseConversation$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (((java.lang.Boolean) objKWHzl).booleanValue()) {
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C56443yFo.KWHzl(true));
            }
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        throw new OKIMException("Delete conversation failed", 0, 2, (DefaultConstructorMarker) null);
    }

    @Override // o.sGF
    public Flow<java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.m7441catch(gEmmrt().djBIcL().OLrzqt(str), new ConversationManager$getConversationUnreadCountFlow$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        ConversationManager$getConversationUnreadCount$1 conversationManager$getConversationUnreadCount$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$getConversationUnreadCount$1) {
            conversationManager$getConversationUnreadCount$1 = (ConversationManager$getConversationUnreadCount$1) continuation;
            int i = conversationManager$getConversationUnreadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$getConversationUnreadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$getConversationUnreadCount$1 = new ConversationManager$getConversationUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = conversationManager$getConversationUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$getConversationUnreadCount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                sNF snfDjBIcL = gEmmrt().djBIcL();
                conversationManager$getConversationUnreadCount$1.label = 1;
                objOLrzqt = snfDjBIcL.OLrzqt(str, conversationManager$getConversationUnreadCount$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.lang.Number) objOLrzqt).intValue()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            int iIntValue = ((java.lang.Number) objM7377constructorimpl).intValue();
            C43296rmc.AEQbTJ("ConversationManager", "getConversationUnreadCount success, unreadCount:" + iIntValue);
            return C56443yFo.AEQbTJ(iIntValue);
        }
        C43296rmc.AEQbTJ("ConversationManager", "getConversationUnreadCount failed: " + thM7380exceptionOrNullimpl);
        return C56443yFo.AEQbTJ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConversationManager$markConversationRead$1 conversationManager$markConversationRead$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$markConversationRead$1) {
            conversationManager$markConversationRead$1 = (ConversationManager$markConversationRead$1) continuation;
            int i = conversationManager$markConversationRead$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$markConversationRead$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$markConversationRead$1 = new ConversationManager$markConversationRead$1(this, continuation);
            }
        }
        java.lang.Object objAYXKKw = conversationManager$markConversationRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$markConversationRead$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAYXKKw);
                Result.Application application = Result.Companion;
                sNF snfDjBIcL = gEmmrt().djBIcL();
                conversationManager$markConversationRead$1.L$0 = str;
                conversationManager$markConversationRead$1.label = 1;
                objAYXKKw = snfDjBIcL.AYXKKw(str, conversationManager$markConversationRead$1);
                if (objAYXKKw == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) conversationManager$markConversationRead$1.L$0;
                C56391yDq.AEQbTJ(objAYXKKw);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objAYXKKw).booleanValue()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ConversationManager", "markConversationRead failed for channelId: " + str, thM7380exceptionOrNullimpl);
            throw thM7380exceptionOrNullimpl;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ConversationManager$markConversationMessagesRead$1 conversationManager$markConversationMessagesRead$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$markConversationMessagesRead$1) {
            conversationManager$markConversationMessagesRead$1 = (ConversationManager$markConversationMessagesRead$1) continuation;
            int i = conversationManager$markConversationMessagesRead$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$markConversationMessagesRead$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$markConversationMessagesRead$1 = new ConversationManager$markConversationMessagesRead$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = conversationManager$markConversationMessagesRead$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$markConversationMessagesRead$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                sNF snfDjBIcL = gEmmrt().djBIcL();
                conversationManager$markConversationMessagesRead$1.L$0 = str;
                conversationManager$markConversationMessagesRead$1.label = 1;
                objKWHzl = snfDjBIcL.KWHzl(str, conversationManager$markConversationMessagesRead$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) conversationManager$markConversationMessagesRead$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objKWHzl).booleanValue()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C43296rmc.copydefault("ConversationManager", "markConversationMessagesRead failed for channelId: " + str, thM7380exceptionOrNullimpl);
            throw thM7380exceptionOrNullimpl;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object djBIcL(@NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        ConversationManager$getTotalUnreadCount$1 conversationManager$getTotalUnreadCount$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$getTotalUnreadCount$1) {
            conversationManager$getTotalUnreadCount$1 = (ConversationManager$getTotalUnreadCount$1) continuation;
            int i = conversationManager$getTotalUnreadCount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$getTotalUnreadCount$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$getTotalUnreadCount$1 = new ConversationManager$getTotalUnreadCount$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = conversationManager$getTotalUnreadCount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$getTotalUnreadCount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                sNF snfDjBIcL = gEmmrt().djBIcL();
                conversationManager$getTotalUnreadCount$1.label = 1;
                objEZpvd = snfDjBIcL.EZpvd(false, (Continuation<? super java.lang.Integer>) conversationManager$getTotalUnreadCount$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.lang.Number) objEZpvd).intValue()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            int iIntValue = ((java.lang.Number) objM7377constructorimpl).intValue();
            C43296rmc.AEQbTJ("ConversationManager", "getAllChatUnReadCountSuspend success, unreadCount:" + iIntValue);
            return C56443yFo.AEQbTJ(iIntValue);
        }
        C43296rmc.AEQbTJ("ConversationManager", "getAllChatUnReadCountSuspend failed: " + thM7380exceptionOrNullimpl);
        return C56443yFo.AEQbTJ(0);
    }

    @Override // o.sGF
    public Flow<java.lang.Integer> EZpvd() {
        if (!sDZ.AEQbTJ.uzCIH()) {
            C44124sEe.imLogGetAllUnreadCountFlow$default("IM is not enabled, emit 0", null, 2, null);
            return FlowKt.flowOf(0);
        }
        return FlowKt.m7441catch(gEmmrt().djBIcL().copydefault(false), new ConversationManager$getTotalUnreadCountFlow$1(null));
    }

    public Flow<java.lang.Integer> EZpvd(boolean z, @NotNull java.util.List<? extends InHouseIMChannelType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.m7441catch(gEmmrt().djBIcL().EZpvd(false, list), new ConversationManager$getTotalUnreadCountByChannelTypeFlow$1(null));
    }

    @Override // o.sGF
    public java.lang.Object AEQbTJ(@NotNull OKConversation oKConversation, boolean z, @NotNull Continuation<? super sNF.Application> continuation) {
        return gEmmrt().djBIcL().OLrzqt(oKConversation, z, continuation);
    }

    @Override // o.sGF
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.StateListAnimator> continuation) {
        return gEmmrt().djBIcL().KWHzl(str, z, z2, continuation);
    }

    @Override // o.sGF
    public java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.ActionBar> continuation) {
        return gEmmrt().djBIcL().AEQbTJ(str, z, z2, continuation);
    }

    @Override // o.sGF
    public java.lang.Object KWHzl(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super sNF.Dialog> continuation) {
        return gEmmrt().djBIcL().EZpvd(str, draftMessageModel, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.sGF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super sNF.Application> continuation) throws java.lang.Throwable {
        ConversationManager$changeContactNoDisturbStatus$1 conversationManager$changeContactNoDisturbStatus$1;
        sGB sgb;
        if (continuation instanceof ConversationManager$changeContactNoDisturbStatus$1) {
            conversationManager$changeContactNoDisturbStatus$1 = (ConversationManager$changeContactNoDisturbStatus$1) continuation;
            int i = conversationManager$changeContactNoDisturbStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$changeContactNoDisturbStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$changeContactNoDisturbStatus$1 = new ConversationManager$changeContactNoDisturbStatus$1(this, continuation);
            }
        }
        java.lang.Object conversation$default = conversationManager$changeContactNoDisturbStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$changeContactNoDisturbStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(conversation$default);
            OKConversationType oKConversationType = OKConversationType.PRIVATE;
            conversationManager$changeContactNoDisturbStatus$1.L$0 = this;
            conversationManager$changeContactNoDisturbStatus$1.Z$0 = z;
            conversationManager$changeContactNoDisturbStatus$1.label = 1;
            conversation$default = sGF.Activity.getConversation$default(this, oKConversationType, str, true, false, null, conversationManager$changeContactNoDisturbStatus$1, 24, null);
            if (conversation$default == objCopydefault) {
                return objCopydefault;
            }
            sgb = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(conversation$default);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = conversationManager$changeContactNoDisturbStatus$1.Z$0;
            sgb = (sGB) conversationManager$changeContactNoDisturbStatus$1.L$0;
            C56391yDq.AEQbTJ(conversation$default);
        }
        conversationManager$changeContactNoDisturbStatus$1.L$0 = null;
        conversationManager$changeContactNoDisturbStatus$1.label = 2;
        conversation$default = sgb.AEQbTJ((OKConversation) conversation$default, z, conversationManager$changeContactNoDisturbStatus$1);
        return conversation$default == objCopydefault ? objCopydefault : conversation$default;
    }

    @Override // o.sGF
    public Flow<OKConversation> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt().EZpvd().OLrzqt(str);
    }

    @Override // o.sGF
    public java.lang.Object AhwBna(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return gEmmrt().EZpvd().KWHzl(continuation);
    }

    @Override // o.sGF
    public Flow<Result<OKConversation>> AEQbTJ(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull IMSource iMSource, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(iMSource, "");
        return gEmmrt().EZpvd().EZpvd(str, oKConversationType, iMSource, str2);
    }

    @Override // o.sGF
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return gEmmrt().djBIcL().gEmmrt(str, continuation);
    }

    @Override // o.sGF
    public void OLrzqt(@NotNull java.lang.String str, InterfaceC44197sGx interfaceC44197sGx) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().djBIcL().AEQbTJ(str, interfaceC44197sGx);
    }

    @Override // o.sGF
    public void EZpvd(@NotNull java.lang.String str, sGC sgc) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt().djBIcL().copydefault(str, sgc);
    }

    @Override // o.sGF
    public Flow<Result<java.util.List<OKConversation>>> OLrzqt() {
        return FlowKt.m7441catch(new ActionBar(gEmmrt().EZpvd().AEQbTJ()), new ConversationManager$getConversationFlow$2(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<AnnouncementBanner>> continuation) throws java.lang.Throwable {
        ConversationManager$getAnnouncementBannerAsResult$1 conversationManager$getAnnouncementBannerAsResult$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof ConversationManager$getAnnouncementBannerAsResult$1) {
            conversationManager$getAnnouncementBannerAsResult$1 = (ConversationManager$getAnnouncementBannerAsResult$1) continuation;
            int i = conversationManager$getAnnouncementBannerAsResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationManager$getAnnouncementBannerAsResult$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationManager$getAnnouncementBannerAsResult$1 = new ConversationManager$getAnnouncementBannerAsResult$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = conversationManager$getAnnouncementBannerAsResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationManager$getAnnouncementBannerAsResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                sNF snfDjBIcL = gEmmrt().djBIcL();
                conversationManager$getAnnouncementBannerAsResult$1.label = 1;
                objOLrzqt = snfDjBIcL.OLrzqt(conversationManager$getAnnouncementBannerAsResult$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AnnouncementBanner) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            AnnouncementBanner announcementBanner = (AnnouncementBanner) objM7377constructorimpl;
            C44124sEe.imLogConversation$default("getAnnouncementBanner success => banner:" + announcementBanner, null, 2, null);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(announcementBanner);
        }
        C44124sEe.KWHzl("getAnnouncementBanner failed", thM7380exceptionOrNullimpl);
        Result.Application application4 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
    }

    @Override // o.sGF
    public java.lang.Object EZpvd(@NotNull Continuation<? super AnnouncementBanner> continuation) {
        return gEmmrt().djBIcL().OLrzqt(continuation);
    }

    @Override // o.sGF
    public void EZpvd(@NotNull AnnouncementBanner announcementBanner) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(announcementBanner, "");
        try {
            Result.Application application = Result.Companion;
            gEmmrt().djBIcL().copydefault(announcementBanner);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return;
        }
        C44124sEe.KWHzl("cancelAnnouncementBanner failed", thM7380exceptionOrNullimpl);
        throw thM7380exceptionOrNullimpl;
    }

    @Override // o.sGF
    public boolean OLrzqt(@NotNull AnnouncementBanner announcementBanner) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(announcementBanner, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(gEmmrt().djBIcL().EZpvd(announcementBanner)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        }
        C44124sEe.KWHzl("hasAnnouncementBannerCancelled failed", thM7380exceptionOrNullimpl);
        return false;
    }

    @Override // o.sGF
    public Flow<java.lang.Integer> copydefault() {
        return FlowKt.m7441catch(gEmmrt().djBIcL().KWHzl(), new ConversationManager$getConversationTotalCountFlow$1(null));
    }

    @Override // o.sGF
    public Flow<java.lang.Integer> AEQbTJ() {
        return FlowKt.m7441catch(gEmmrt().djBIcL().AEQbTJ(), new ConversationManager$getConversationCountWithoutNotificationFlow$1(null));
    }

    @Override // o.sGF
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = gEmmrt().EZpvd().EZpvd(str, list, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    @Override // o.sGF
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) {
        return gEmmrt().djBIcL().AhwBna(str, continuation);
    }
}
