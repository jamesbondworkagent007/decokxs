package com.okinc.planet.biz_content.publisher;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.PublishResponse;
import com.okinc.planet.domain.remote.dto.SaveDraftResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.ActivityC47702tvB;
import o.C47546tsE;
import o.C47576tsi;
import o.C47625tte;
import o.C47793twn;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherActivity$handlePublishClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ boolean $isDraftChange;
    final /* synthetic */ boolean $isSaveDraft;
    int label;
    final /* synthetic */ ActivityC47702tvB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherActivity$handlePublishClick$1(ActivityC47702tvB activityC47702tvB, boolean z, String str, boolean z2, Continuation<? super PlanetPublisherActivity$handlePublishClick$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC47702tvB;
        this.$isSaveDraft = z;
        this.$content = str;
        this.$isDraftChange = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherActivity$handlePublishClick$1(this.this$0, this.$isSaveDraft, this.$content, this.$isDraftChange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherActivity$handlePublishClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C47576tsi c47576tsi = this.this$0.AhwBna;
                    C47625tte c47625tteAkhnZx = c47576tsi != null ? c47576tsi.AkhnZx() : null;
                    if (c47625tteAkhnZx != null) {
                        C47576tsi c47576tsi2 = this.this$0.AhwBna;
                        C47546tsE.StateListAnimator stateListAnimatorDbNXlk = c47576tsi2 != null ? c47576tsi2.DbNXlk() : null;
                        if (this.$isSaveDraft) {
                            C47793twn c47793twnAkhnZx = this.this$0.AkhnZx();
                            String str = this.$content;
                            this.label = 1;
                            obj = c47793twnAkhnZx.copydefault(str, c47625tteAkhnZx, stateListAnimatorDbNXlk, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.AEQbTJ((AbstractC43419rot<SaveDraftResponse, OKServerException>) obj, this.$isDraftChange);
                        } else {
                            C47793twn c47793twnAkhnZx2 = this.this$0.AkhnZx();
                            String str2 = this.$content;
                            this.label = 2;
                            obj = c47793twnAkhnZx2.EZpvd(str2, c47625tteAkhnZx, stateListAnimatorDbNXlk, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            this.this$0.OLrzqt((AbstractC43419rot<PublishResponse, OKServerException>) obj);
                        }
                    } else {
                        this.this$0.AEQbTJ("Failed to get text input data", true);
                    }
                } else if (i == 1) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.AEQbTJ((AbstractC43419rot<SaveDraftResponse, OKServerException>) obj, this.$isDraftChange);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.OLrzqt((AbstractC43419rot<PublishResponse, OKServerException>) obj);
                }
            } catch (Exception e) {
                ActivityC47702tvB activityC47702tvB = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                activityC47702tvB.AEQbTJ(message, true);
            }
            this.this$0.dismissLoading();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.dismissLoading();
            throw th;
        }
    }
}
