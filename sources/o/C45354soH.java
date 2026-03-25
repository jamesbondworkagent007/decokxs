package o;

import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.bean.enums.SupportChannelType;
import com.okinc.biz.model.SupportService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.common.bean.UnifiedEntranceResponse;
import com.okinc.okex.common.model.SupportServiceData;
import com.okinc.okex.common.navigator.CommonServiceKey;
import com.okinc.okex.common.usecase.UnifiedEntranceUseCase$getUnifiedEntrance$1;
import com.okinc.okex.common.usecase.UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C45354soH;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45354soH {
    public static final int copydefault = 8;
    public final InterfaceC45301snH AEQbTJ;
    public final C45300snG EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX INFO: renamed from: o.soH$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportChannelType.values().length];
            try {
                iArr[SupportChannelType.HelpCenter.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C45354soH(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C45300snG c45300snG, @NotNull InterfaceC45301snH interfaceC45301snH) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = c45300snG;
        this.AEQbTJ = interfaceC45301snH;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #3 {all -> 0x003c, blocks: (B:12:0x0038, B:24:0x0061, B:26:0x0069, B:28:0x006f, B:29:0x007c), top: B:60:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C6811aWS c6811aWS, @NotNull Continuation<? super SupportService> continuation) throws java.lang.Throwable {
        UnifiedEntranceUseCase$getUnifiedEntrance$1 unifiedEntranceUseCase$getUnifiedEntrance$1;
        C45354soH c45354soH;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        SupportService supportServiceCopydefault;
        ResponseData responseData;
        C6811aWS c6811aWS2 = c6811aWS;
        if (continuation instanceof UnifiedEntranceUseCase$getUnifiedEntrance$1) {
            unifiedEntranceUseCase$getUnifiedEntrance$1 = (UnifiedEntranceUseCase$getUnifiedEntrance$1) continuation;
            int i = unifiedEntranceUseCase$getUnifiedEntrance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unifiedEntranceUseCase$getUnifiedEntrance$1.label = i - Integer.MIN_VALUE;
            } else {
                unifiedEntranceUseCase$getUnifiedEntrance$1 = new UnifiedEntranceUseCase$getUnifiedEntrance$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = unifiedEntranceUseCase$getUnifiedEntrance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unifiedEntranceUseCase$getUnifiedEntrance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                Result.Application application = Result.Companion;
                try {
                    CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                    UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1 unifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1 = new UnifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1(this, c6811aWS2, null);
                    unifiedEntranceUseCase$getUnifiedEntrance$1.L$0 = this;
                    unifiedEntranceUseCase$getUnifiedEntrance$1.L$1 = c6811aWS2;
                    unifiedEntranceUseCase$getUnifiedEntrance$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, unifiedEntranceUseCase$getUnifiedEntrance$result$1$1$1, unifiedEntranceUseCase$getUnifiedEntrance$1);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c45354soH = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                c45354soH = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c45354soH = this;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44760scx.log$default("getUnifiedEntrance failed: " + thM7380exceptionOrNullimpl, null, 2, null);
            }
            UnifiedEntranceResponse unifiedEntranceResponse = (UnifiedEntranceResponse) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            return (unifiedEntranceResponse != null || (supportServiceCopydefault = c45354soH.copydefault(unifiedEntranceResponse, c6811aWS2.AEQbTJ())) == null) ? new SupportService(SupportChannelType.Chatbot, c45354soH.new TaskDescription(c6811aWS2), C33070mpX.AYXKKw(C47315tni.PendingIntent.DPHsZd)) : supportServiceCopydefault;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c6811aWS2 = (C6811aWS) unifiedEntranceUseCase$getUnifiedEntrance$1.L$1;
        c45354soH = (C45354soH) unifiedEntranceUseCase$getUnifiedEntrance$1.L$0;
        try {
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((UnifiedEntranceResponse) actionBar.AEQbTJ());
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        UnifiedEntranceResponse unifiedEntranceResponse2 = (UnifiedEntranceResponse) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (unifiedEntranceResponse2 != null) {
        }
    }

    /* JADX INFO: renamed from: o.soH$TaskDescription */
    public static final class TaskDescription implements InterfaceC6817aWY {
        public final /* synthetic */ C6811aWS KWHzl;

        public TaskDescription(C6811aWS c6811aWS) {
            this.KWHzl = c6811aWS;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            java.lang.Object objCopydefault = C45354soH.this.EZpvd.copydefault(CommonServiceKey.Chatbot, context, this.KWHzl.copydefault(), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
    }

    public final SupportService copydefault(UnifiedEntranceResponse unifiedEntranceResponse, C6807aWO c6807aWO) {
        kotlin.Pair pairOLrzqt;
        SupportChannelType channel = unifiedEntranceResponse.getChannel();
        if (channel != null) {
            SupportServiceData channelData = unifiedEntranceResponse.getChannelData();
            if (channelData instanceof SupportServiceData.ChatbotData) {
                pairOLrzqt = C56390yDp.OLrzqt(new StateListAnimator(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.DPHsZd));
            } else if (channelData instanceof SupportServiceData.FormData) {
                pairOLrzqt = C56390yDp.OLrzqt(new Activity(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.fkESqH));
            } else if (channelData instanceof SupportServiceData.EmailData) {
                pairOLrzqt = C56390yDp.OLrzqt(new ActionBar(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.aJZHYI));
            } else if (channelData instanceof SupportServiceData.ArticleData) {
                pairOLrzqt = C56390yDp.OLrzqt(new LoaderManager(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.RvdRAu));
            } else if (channelData instanceof SupportServiceData.MinSupportPageData) {
                pairOLrzqt = C56390yDp.OLrzqt(new Dialog(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.geLlBI));
            } else if (channelData instanceof SupportServiceData.RecentActivitiesData) {
                pairOLrzqt = C56390yDp.OLrzqt(new FragmentManager(unifiedEntranceResponse), C33070mpX.AYXKKw(C47315tni.PendingIntent.RAQtXZ));
            } else if (Application.OLrzqt[channel.ordinal()] == 1) {
                pairOLrzqt = C56390yDp.OLrzqt(new PendingIntent(c6807aWO, unifiedEntranceResponse, this), C33070mpX.AYXKKw(C47315tni.PendingIntent.DPHNDa));
            }
            return new SupportService(channel, (InterfaceC6817aWY) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2());
        }
        return null;
    }

    /* JADX INFO: renamed from: o.soH$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse OLrzqt;

        public StateListAnimator(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.OLrzqt = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            final UnifiedEntranceResponse unifiedEntranceResponse = this.OLrzqt;
            java.lang.Object objCopydefault = C45354soH.this.EZpvd.copydefault(CommonServiceKey.Chatbot, context, C6805aWM.OLrzqt(new Function1() { // from class: o.soI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45354soH.StateListAnimator.copydefault(unifiedEntranceResponse, (ChatBotRequest) obj);
                }
            }), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static final Unit copydefault(UnifiedEntranceResponse unifiedEntranceResponse, ChatBotRequest chatBotRequest) {
            Intrinsics.checkNotNullParameter(chatBotRequest, "");
            java.lang.String message = ((SupportServiceData.ChatbotData) unifiedEntranceResponse.getChannelData()).getMessage();
            chatBotRequest.setOkaChatbotMessage(message != null ? message : "");
            JsonObject params = ((SupportServiceData.ChatbotData) unifiedEntranceResponse.getChannelData()).getParams();
            chatBotRequest.setContextualParams(params != null ? C33129mqd.gEmmrt(params) : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$Activity */
    public static final class Activity implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse copydefault;

        public Activity(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.copydefault = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            java.lang.Object objCopydefault = C45354soH.this.EZpvd.copydefault(CommonServiceKey.TicketForm, context, this.copydefault.getChannelData(), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$ActionBar */
    public static final class ActionBar implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse KWHzl;

        public ActionBar(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.KWHzl = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            java.lang.Object objCopydefault = C45354soH.this.EZpvd.copydefault(CommonServiceKey.Email, context, this.KWHzl.getChannelData(), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$LoaderManager */
    public static final class LoaderManager implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse OLrzqt;

        public LoaderManager(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.OLrzqt = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            java.lang.Object objCopydefault = C45354soH.this.EZpvd.copydefault(CommonServiceKey.Article, context, ((SupportServiceData.ArticleData) this.OLrzqt.getChannelData()).getLink(), continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$Dialog */
    public static final class Dialog implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse OLrzqt;

        public Dialog(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.OLrzqt = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(((SupportServiceData.MinSupportPageData) this.OLrzqt.getChannelData()).getId());
            if (interfaceC6804aWL != null && C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                context.startActivity(interfaceC6804aWL.EZpvd(context, strGEmmrt));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$FragmentManager */
    public static final class FragmentManager implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse copydefault;

        public FragmentManager(UnifiedEntranceResponse unifiedEntranceResponse) {
            this.copydefault = unifiedEntranceResponse;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            java.lang.String tab = ((SupportServiceData.RecentActivitiesData) this.copydefault.getChannelData()).getTab();
            if (tab == null) {
                tab = "";
            }
            context.startActivity(ActivityC44878sfI.Companion.copydefault(context, C56443yFo.AEQbTJ(C45528sri.EZpvd(tab))));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.soH$PendingIntent */
    public static final class PendingIntent implements InterfaceC6817aWY {
        public final /* synthetic */ UnifiedEntranceResponse AEQbTJ;
        public final /* synthetic */ C6807aWO KWHzl;
        public final /* synthetic */ C45354soH copydefault;

        public PendingIntent(C6807aWO c6807aWO, UnifiedEntranceResponse unifiedEntranceResponse, C45354soH c45354soH) {
            this.KWHzl = c6807aWO;
            this.AEQbTJ = unifiedEntranceResponse;
            this.copydefault = c45354soH;
        }

        @Override // o.InterfaceC6817aWY
        public java.lang.Object OLrzqt(android.content.Context context, Continuation<? super Unit> continuation) {
            C6807aWO c6807aWO;
            C6807aWO c6807aWO2 = this.KWHzl;
            if (c6807aWO2 != null) {
                UnifiedEntranceResponse unifiedEntranceResponse = this.AEQbTJ;
                java.lang.String strEZpvd = c6807aWO2.EZpvd();
                java.lang.String strOLrzqt = c6807aWO2.OLrzqt();
                java.lang.String strDjBIcL = c6807aWO2.djBIcL();
                java.lang.String strCopydefault = c6807aWO2.copydefault();
                SupportServiceData channelData = unifiedEntranceResponse.getChannelData();
                SupportServiceData.HelpCenterData helpCenterData = channelData instanceof SupportServiceData.HelpCenterData ? (SupportServiceData.HelpCenterData) channelData : null;
                c6807aWO = new C6807aWO(strEZpvd, strOLrzqt, strDjBIcL, strCopydefault, "pay_user_center_support", helpCenterData != null ? helpCenterData.getSlug() : null);
            } else {
                SupportServiceData channelData2 = this.AEQbTJ.getChannelData();
                SupportServiceData.HelpCenterData helpCenterData2 = channelData2 instanceof SupportServiceData.HelpCenterData ? (SupportServiceData.HelpCenterData) channelData2 : null;
                c6807aWO = new C6807aWO(null, null, null, "unified-entrance", "pay_user_center_support", helpCenterData2 != null ? helpCenterData2.getSlug() : null);
            }
            java.lang.Object objCopydefault = this.copydefault.EZpvd.copydefault(CommonServiceKey.SupportCenter, context, c6807aWO, continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }
    }
}
