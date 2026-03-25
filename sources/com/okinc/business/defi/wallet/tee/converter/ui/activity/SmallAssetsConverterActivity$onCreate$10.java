package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.OKServerException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC43419rot;
import o.ActivityC17837fUc;
import o.C10854bwM;
import o.C13754dXa;
import o.C16434ejp;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C54870xYj;
import o.C54880xYt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.fTZ;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$onCreate$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$onCreate$10(ActivityC17837fUc activityC17837fUc, Continuation<? super SmallAssetsConverterActivity$onCreate$10> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$onCreate$10(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$onCreate$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$10$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17837fUc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17837fUc activityC17837fUc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17837fUc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC43419rot<SmallAssetQuoteData, OKServerException>) abstractC43419rot, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC43419rot<SmallAssetQuoteData, OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC43419rot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) this.L$0;
                C10854bwM c10854bwMDjBIcL = this.this$0.AYXKKw().djBIcL();
                if (c10854bwMDjBIcL == null) {
                    return Unit.INSTANCE;
                }
                C16434ejp c16434ejp = null;
                if (abstractC43419rot == null) {
                    C16434ejp c16434ejp2 = this.this$0.valueOf;
                    if (c16434ejp2 == null) {
                        Intrinsics.gEmmrt("");
                        c16434ejp2 = null;
                    }
                    c16434ejp2.AEQbTJ.setVisibility(8);
                    C16434ejp c16434ejp3 = this.this$0.valueOf;
                    if (c16434ejp3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16434ejp = c16434ejp3;
                    }
                    c16434ejp.gEmmrt.setVisibility(8);
                    this.this$0.AhwBna();
                    return Unit.INSTANCE;
                }
                int i = 0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    Throwable origin = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getOrigin();
                    if (origin instanceof OKServerException) {
                        OKServerException oKServerException = (OKServerException) origin;
                        if (oKServerException.getCode() == 10062 || oKServerException.getCode() == 10063) {
                            C16434ejp c16434ejp4 = this.this$0.valueOf;
                            if (c16434ejp4 == null) {
                                Intrinsics.gEmmrt("");
                                c16434ejp4 = null;
                            }
                            c16434ejp4.fJNWhG.setVisibility(4);
                            C16434ejp c16434ejp5 = this.this$0.valueOf;
                            if (c16434ejp5 == null) {
                                Intrinsics.gEmmrt("");
                                c16434ejp5 = null;
                            }
                            c16434ejp5.OLrzqt.setChecked(false);
                            C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) C56402yEa.EZpvd(new fTZ.ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendQueueTitle), oKServerException.getMessage(), false)));
                            C16434ejp c16434ejp6 = this.this$0.valueOf;
                            if (c16434ejp6 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c16434ejp = c16434ejp6;
                            }
                            c16434ejp.AkhnZx.djBIcL(false);
                        } else if (!(origin instanceof CancellationException)) {
                            C16434ejp c16434ejp7 = this.this$0.valueOf;
                            if (c16434ejp7 == null) {
                                Intrinsics.gEmmrt("");
                                c16434ejp7 = null;
                            }
                            c16434ejp7.AEQbTJ.setVisibility(0);
                            C16434ejp c16434ejp8 = this.this$0.valueOf;
                            if (c16434ejp8 == null) {
                                Intrinsics.gEmmrt("");
                                c16434ejp8 = null;
                            }
                            c16434ejp8.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPlaybackToRemote));
                            C16434ejp c16434ejp9 = this.this$0.valueOf;
                            if (c16434ejp9 == null) {
                                Intrinsics.gEmmrt("");
                                c16434ejp9 = null;
                            }
                            c16434ejp9.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                            C16434ejp c16434ejp10 = this.this$0.valueOf;
                            if (c16434ejp10 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                c16434ejp = c16434ejp10;
                            }
                            c16434ejp.gEmmrt.setVisibility(8);
                            this.this$0.AhwBna();
                        } else {
                            this.this$0.AhwBna();
                        }
                    }
                    return Unit.INSTANCE;
                }
                SmallAssetQuoteData smallAssetQuoteData = (SmallAssetQuoteData) abstractC43419rot.AEQbTJ();
                C16434ejp c16434ejp11 = this.this$0.valueOf;
                if (c16434ejp11 == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp11 = null;
                }
                c16434ejp11.AEQbTJ.setVisibility(0);
                C16434ejp c16434ejp12 = this.this$0.valueOf;
                if (c16434ejp12 == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp12 = null;
                }
                c16434ejp12.AEQbTJ.setText(C54870xYj.OLrzqt(smallAssetQuoteData.getTotalExpectedAmountOut(), (249 & 1) != 0 ? 0 : 0, c10854bwMDjBIcL.AkhnZx(), c10854bwMDjBIcL.fJNWhG(), (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null));
                C16434ejp c16434ejp13 = this.this$0.valueOf;
                if (c16434ejp13 == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp13 = null;
                }
                c16434ejp13.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                C16434ejp c16434ejp14 = this.this$0.valueOf;
                if (c16434ejp14 == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp14 = null;
                }
                c16434ejp14.gEmmrt.setVisibility(0);
                C16434ejp c16434ejp15 = this.this$0.valueOf;
                if (c16434ejp15 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16434ejp = c16434ejp15;
                }
                c16434ejp.gEmmrt.setText(C54880xYt.formatValuation$default(C33129mqd.EZpvd(smallAssetQuoteData.getTotalExpectedAmountOutUsd()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null));
                List<fTZ.Application> listKWHzl = this.this$0.AYXKKw().isConnected().getValue().KWHzl();
                ArrayList<fTZ.Application> arrayList = new ArrayList();
                for (Object obj2 : listKWHzl) {
                    if (((fTZ.Application) obj2).copydefault()) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (fTZ.Application application : arrayList) {
                        boolean zEZpvd = application.EZpvd();
                        boolean zContainsKey = smallAssetQuoteData.getQuotes().containsKey(application.OLrzqt().OLrzqt());
                        application.EZpvd(zContainsKey);
                        if (zEZpvd && !zContainsKey && (i = i + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                }
                if (i > 0) {
                    ActivityC17837fUc activityC17837fUc = this.this$0;
                    ActivityC17837fUc.showNotification$default(activityC17837fUc, null, 5, activityC17837fUc.OLrzqt(i), null, 2000L, 9, null);
                }
                this.this$0.djBIcL.notifyDataSetChanged();
                this.this$0.AhwBna();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC43419rot<SmallAssetQuoteData, OKServerException>> stateFlowValues = this.this$0.AYXKKw().values();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowValues, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
