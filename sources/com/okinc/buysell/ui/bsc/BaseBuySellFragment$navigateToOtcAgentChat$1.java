package com.okinc.buysell.ui.bsc;

import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;
import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C35185nqZ;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC44289sKh;
import o.pUU;
import o.sKH;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseBuySellFragment$navigateToOtcAgentChat$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BaseBuySellFragment<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellFragment$navigateToOtcAgentChat$1(BaseBuySellFragment<T> baseBuySellFragment, Continuation<? super BaseBuySellFragment$navigateToOtcAgentChat$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellFragment$navigateToOtcAgentChat$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellFragment$navigateToOtcAgentChat$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BaseBuySellFragment baseBuySellFragment;
        InterfaceC35180nqU interfaceC35180nqU;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU2 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU2 != null) {
                baseBuySellFragment = this.this$0;
                FragmentActivity activity = baseBuySellFragment.getActivity();
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                this.L$0 = baseBuySellFragment;
                this.L$1 = interfaceC35180nqU2;
                this.label = 1;
                Object objOLrzqt = interfaceC35180nqU2.OLrzqt(activity, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC35180nqU = interfaceC35180nqU2;
                objM7386unboximpl = objOLrzqt;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC35180nqU = (InterfaceC35180nqU) this.L$1;
        baseBuySellFragment = (BaseBuySellFragment) this.L$0;
        C56391yDq.AEQbTJ(obj);
        objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        C35185nqZ c35185nqZ = (C35185nqZ) objM7386unboximpl;
        if (c35185nqZ != null) {
            String strEZpvd = c35185nqZ.EZpvd();
            c35185nqZ.copydefault();
            String strFARcdN = baseBuySellFragment.fARcdN();
            pUU.EZpvd(baseBuySellFragment.getTAG(), "navigateToOtcAgentChat:initMessage " + strFARcdN);
            sKH skhCopydefault = interfaceC35180nqU.copydefault();
            OKMessage.Companion companion = OKMessage.Companion;
            OKConversationType oKConversationType = OKConversationType.GROUP;
            BaseBuySellFragment.OtcAgentGetQuoteMessage otcAgentGetQuoteMessage = new BaseBuySellFragment.OtcAgentGetQuoteMessage();
            otcAgentGetQuoteMessage.setServiceName("assistant-api");
            otcAgentGetQuoteMessage.setBizName("OTC_INTERNAL_PROMPT_MESSAGE");
            Json.Default r8 = Json.Default;
            BaseBuySellFragment.OtcAgentGetQuoteMessageContent otcAgentGetQuoteMessageContent = new BaseBuySellFragment.OtcAgentGetQuoteMessageContent("OTC_INTERNAL_PROMPT_MESSAGE", new BaseBuySellFragment.OtcAgentGetQuoteMessageData(strFARcdN));
            r8.getSerializersModule();
            otcAgentGetQuoteMessage.setContent(r8.encodeToString(BaseBuySellFragment.OtcAgentGetQuoteMessageContent.Companion.serializer(), otcAgentGetQuoteMessageContent));
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            jsonObjectBuilder.put("domain", JsonElementKt.JsonPrimitive("okx-assistant"));
            jsonObjectBuilder.put("source", JsonElementKt.JsonPrimitive("user"));
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            r8.getSerializersModule();
            otcAgentGetQuoteMessage.setExtra(r8.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild));
            Unit unit = Unit.INSTANCE;
            skhCopydefault.KWHzl(companion.OLrzqt(strEZpvd, oKConversationType, otcAgentGetQuoteMessage), "", "", new TaskDescription(baseBuySellFragment, interfaceC35180nqU, strEZpvd));
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements InterfaceC44289sKh {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ BaseBuySellFragment<T> OLrzqt;
        public final /* synthetic */ InterfaceC35180nqU copydefault;

        public TaskDescription(BaseBuySellFragment<T> baseBuySellFragment, InterfaceC35180nqU interfaceC35180nqU, String str) {
            this.OLrzqt = baseBuySellFragment;
            this.copydefault = interfaceC35180nqU;
            this.AEQbTJ = str;
        }

        @Override // o.InterfaceC44289sKh
        public void copydefault(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            pUU.EZpvd(this.OLrzqt.getTAG(), "navigateToOtcAgentChat:sendMessage onStart");
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            pUU.EZpvd(this.OLrzqt.getTAG(), "navigateToOtcAgentChat:sendMessage onSuccess");
            FragmentActivity activity = this.OLrzqt.getActivity();
            if (activity != null) {
                BaseBuySellFragment<T> baseBuySellFragment = this.OLrzqt;
                InterfaceC35180nqU interfaceC35180nqU = this.copydefault;
                String str = this.AEQbTJ;
                baseBuySellFragment.AubY().QOLQEE();
                InterfaceC35180nqU.ActionBar.startChatActivity$default(interfaceC35180nqU, activity, str, null, null, null, null, IMPageType.OTC_AGENT_BOT, 60, null);
            }
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(OKMessage oKMessage, Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault(this.OLrzqt.getTAG(), "navigateToOtcAgentChat:sendMessage onError", th);
        }
    }
}
