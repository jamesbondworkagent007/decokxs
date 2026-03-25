package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C17833fTz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needToRequestAsset;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ ActivateSAViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAViewModel$loadData$1(ActivateSAViewModel activateSAViewModel, boolean z, Continuation<? super ActivateSAViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = activateSAViewModel;
        this.$needToRequestAsset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAViewModel$loadData$1(this.this$0, this.$needToRequestAsset, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #2 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:11:0x003a, B:63:0x01b2, B:14:0x004e, B:60:0x0199, B:15:0x0053, B:54:0x0161, B:16:0x0058, B:67:0x01db, B:23:0x0067, B:47:0x0130, B:49:0x0136, B:51:0x0146, B:56:0x0164, B:64:0x01c8, B:26:0x007f, B:44:0x011b, B:29:0x008a, B:40:0x00fe, B:36:0x00d3), top: B:86:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #2 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:11:0x003a, B:63:0x01b2, B:14:0x004e, B:60:0x0199, B:15:0x0053, B:54:0x0161, B:16:0x0058, B:67:0x01db, B:23:0x0067, B:47:0x0130, B:49:0x0136, B:51:0x0146, B:56:0x0164, B:64:0x01c8, B:26:0x007f, B:44:0x011b, B:29:0x008a, B:40:0x00fe, B:36:0x00d3), top: B:86:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0247 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object obj2;
        ActivateSAViewModel activateSAViewModel;
        ViewDataChanged viewDataChanged;
        ActivateSAViewModel$loadData$1$4$2 activateSAViewModel$loadData$1$4$2;
        InterfaceC49371unL.Activity activity;
        Object objAwait;
        ActivateSAViewModel activateSAViewModel2;
        boolean z;
        ActivateSAViewModel$loadData$1$2$1 activateSAViewModel$loadData$1$2$1;
        String strAkhnZx;
        ActivateSAViewModel activateSAViewModel3;
        AbstractC12782ctV abstractC12782ctV;
        Object objKWHzl;
        Throwable thM7380exceptionOrNullimpl2;
        ViewDataReady viewDataReady;
        int i;
        boolean z2;
        ActivateSAViewModel$loadData$1$2$4 activateSAViewModel$loadData$1$2$4;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                ActivateSAViewModel activateSAViewModel4 = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.label = 1;
                if (activateSAViewModel4.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
                pUU.copydefault("ActivateSAViewModel", "flowParams.accountId = " + this.this$0.AEQbTJ().getValue().getAccountId());
                ActivateSAViewModel activateSAViewModel5 = this.this$0;
                boolean z3 = this.$needToRequestAsset;
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = activateSAViewModel5.AhwBna.OLrzqt(activateSAViewModel5.AEQbTJ().getValue().getAccountId(), false);
                this.L$0 = activateSAViewModel5;
                this.Z$0 = z3;
                this.label = 2;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                activateSAViewModel2 = activateSAViewModel5;
                z = z3;
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
                activateSAViewModel$loadData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((ActivateSAViewModel.Application) obj3).djBIcL();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).copydefault((String) obj4);
                    }
                };
                strAkhnZx = abstractC12782ctV2.AkhnZx();
                this.L$0 = activateSAViewModel2;
                this.L$1 = abstractC12782ctV2;
                this.Z$0 = z;
                this.label = 3;
                if (activateSAViewModel2.KWHzl(activateSAViewModel$loadData$1$2$1, strAkhnZx, this) != objCopydefault) {
                    return objCopydefault;
                }
                activateSAViewModel3 = activateSAViewModel2;
                abstractC12782ctV = abstractC12782ctV2;
                C17833fTz c17833fTz = activateSAViewModel3.KWHzl;
                Intrinsics.copydefault(abstractC12782ctV);
                this.L$0 = activateSAViewModel3;
                this.L$1 = null;
                this.label = 4;
                objKWHzl = c17833fTz.KWHzl(abstractC12782ctV, z, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                    ActivateSAViewModel$loadData$1$2$viewDataReady$1$1 activateSAViewModel$loadData$1$2$viewDataReady$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$viewDataReady$1$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                        }
                    };
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl2, null, 2, null);
                    this.L$0 = null;
                    this.label = 5;
                    if (activateSAViewModel3.KWHzl(activateSAViewModel$loadData$1$2$viewDataReady$1$1, application3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                viewDataReady = (ViewDataReady) objKWHzl;
                if (viewDataReady.getTeeMetaData().getExpirePeriodDayList().isEmpty()) {
                    ActivateSAViewModel$loadData$1$2$2 activateSAViewModel$loadData$1$2$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                        }
                    };
                    InterfaceC49371unL.Application application4 = new InterfaceC49371unL.Application(TeeGeneratedError.Companion.EZpvd("ActivateSAViewModel : expirePeriodDayList is empty"), null, 2, null);
                    this.L$0 = null;
                    this.label = 6;
                    if (activateSAViewModel3.KWHzl(activateSAViewModel$loadData$1$2$2, application4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                int defaultExpirePeriodDay = viewDataReady.getTeeMetaData().getDefaultExpirePeriodDay();
                boolean zEZpvd = Intrinsics.EZpvd(viewDataReady.getTeeMetaData().getDefaultAutoRenew(), C56443yFo.KWHzl(true));
                ActivateSAViewModel$loadData$1$2$3 activateSAViewModel$loadData$1$2$3 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return Integer.valueOf(((ActivateSAViewModel.Application) obj3).EZpvd());
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).AEQbTJ(((Number) obj4).intValue());
                    }
                };
                Integer numAEQbTJ = C56443yFo.AEQbTJ(defaultExpirePeriodDay);
                this.L$0 = activateSAViewModel3;
                this.L$1 = viewDataReady;
                this.I$0 = defaultExpirePeriodDay;
                this.Z$0 = zEZpvd;
                this.label = 7;
                if (activateSAViewModel3.KWHzl(activateSAViewModel$loadData$1$2$3, numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
                i = defaultExpirePeriodDay;
                z2 = zEZpvd;
                activateSAViewModel$loadData$1$2$4 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return Boolean.valueOf(((ActivateSAViewModel.Application) obj3).copydefault());
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).KWHzl(((Boolean) obj4).booleanValue());
                    }
                };
                boolKWHzl = C56443yFo.KWHzl(z2);
                this.L$0 = viewDataReady;
                this.L$1 = null;
                this.I$0 = i;
                this.Z$0 = z2;
                this.label = 8;
                if (activateSAViewModel3.KWHzl(activateSAViewModel$loadData$1$2$4, boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                boolean z4 = z2;
                int i2 = i;
                ViewDataReady viewDataReady2 = viewDataReady;
                viewDataReady2.getWaringInfo();
                objM7377constructorimpl = Result.m7377constructorimpl(new ViewDataChanged(viewDataReady2, i2, z4, true, false, true, false, 64, null));
                ActivateSAViewModel activateSAViewModel6 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    ActivateSAViewModel$loadData$1$3$1 activateSAViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$3$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                        }
                    };
                    InterfaceC49371unL.Application application5 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 9;
                    if (activateSAViewModel6.KWHzl(activateSAViewModel$loadData$1$3$1, application5, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                obj2 = objM7377constructorimpl;
                activateSAViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    viewDataChanged = (ViewDataChanged) obj2;
                    ActivateSAViewModel$loadData$1$4$1 activateSAViewModel$loadData$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$4$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((ActivateSAViewModel.Application) obj3).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((ActivateSAViewModel.Application) obj3).AEQbTJ((List<Integer>) obj4);
                        }
                    };
                    List<Integer> expirePeriodDayList = viewDataChanged.getViewDataReady().getTeeMetaData().getExpirePeriodDayList();
                    this.L$0 = obj2;
                    this.L$1 = activateSAViewModel;
                    this.L$2 = viewDataChanged;
                    this.label = 10;
                    if (activateSAViewModel.KWHzl(activateSAViewModel$loadData$1$4$1, expirePeriodDayList, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    activateSAViewModel$loadData$1$4$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$4$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                        }
                    };
                    activity = new InterfaceC49371unL.Activity(viewDataChanged);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 11;
                    if (activateSAViewModel.KWHzl(activateSAViewModel$loadData$1$4$2, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("ActivateSAViewModel", "flowParams.accountId = " + this.this$0.AEQbTJ().getValue().getAccountId());
                ActivateSAViewModel activateSAViewModel52 = this.this$0;
                boolean z32 = this.$needToRequestAsset;
                Result.Application application22 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt2 = activateSAViewModel52.AhwBna.OLrzqt(activateSAViewModel52.AEQbTJ().getValue().getAccountId(), false);
                this.L$0 = activateSAViewModel52;
                this.Z$0 = z32;
                this.label = 2;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt2, this);
                if (objAwait != objCopydefault) {
                }
                break;
            case 2:
                z = this.Z$0;
                activateSAViewModel2 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                AbstractC12782ctV abstractC12782ctV22 = (AbstractC12782ctV) objAwait;
                activateSAViewModel$loadData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((ActivateSAViewModel.Application) obj3).djBIcL();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).copydefault((String) obj4);
                    }
                };
                strAkhnZx = abstractC12782ctV22.AkhnZx();
                this.L$0 = activateSAViewModel2;
                this.L$1 = abstractC12782ctV22;
                this.Z$0 = z;
                this.label = 3;
                if (activateSAViewModel2.KWHzl(activateSAViewModel$loadData$1$2$1, strAkhnZx, this) != objCopydefault) {
                }
                break;
            case 3:
                z = this.Z$0;
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                activateSAViewModel3 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C17833fTz c17833fTz2 = activateSAViewModel3.KWHzl;
                Intrinsics.copydefault(abstractC12782ctV);
                this.L$0 = activateSAViewModel3;
                this.L$1 = null;
                this.label = 4;
                objKWHzl = c17833fTz2.KWHzl(abstractC12782ctV, z, this);
                if (objKWHzl == objCopydefault) {
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                break;
            case 4:
                ActivateSAViewModel activateSAViewModel7 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                activateSAViewModel3 = activateSAViewModel7;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                break;
            case 5:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                z2 = this.Z$0;
                i = this.I$0;
                viewDataReady = (ViewDataReady) this.L$1;
                activateSAViewModel3 = (ActivateSAViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                activateSAViewModel$loadData$1$2$4 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$2$4
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return Boolean.valueOf(((ActivateSAViewModel.Application) obj3).copydefault());
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).KWHzl(((Boolean) obj4).booleanValue());
                    }
                };
                boolKWHzl = C56443yFo.KWHzl(z2);
                this.L$0 = viewDataReady;
                this.L$1 = null;
                this.I$0 = i;
                this.Z$0 = z2;
                this.label = 8;
                if (activateSAViewModel3.KWHzl(activateSAViewModel$loadData$1$2$4, boolKWHzl, this) == objCopydefault) {
                }
                boolean z42 = z2;
                int i22 = i;
                ViewDataReady viewDataReady22 = viewDataReady;
                viewDataReady22.getWaringInfo();
                objM7377constructorimpl = Result.m7377constructorimpl(new ViewDataChanged(viewDataReady22, i22, z42, true, false, true, false, 64, null));
                ActivateSAViewModel activateSAViewModel62 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                obj2 = objM7377constructorimpl;
                activateSAViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                return Unit.INSTANCE;
            case 8:
                z2 = this.Z$0;
                i = this.I$0;
                viewDataReady = (ViewDataReady) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolean z422 = z2;
                int i222 = i;
                ViewDataReady viewDataReady222 = viewDataReady;
                viewDataReady222.getWaringInfo();
                objM7377constructorimpl = Result.m7377constructorimpl(new ViewDataChanged(viewDataReady222, i222, z422, true, false, true, false, 64, null));
                ActivateSAViewModel activateSAViewModel622 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                obj2 = objM7377constructorimpl;
                activateSAViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                return Unit.INSTANCE;
            case 9:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = objM7377constructorimpl;
                activateSAViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                return Unit.INSTANCE;
            case 10:
                viewDataChanged = (ViewDataChanged) this.L$2;
                activateSAViewModel = (ActivateSAViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                activateSAViewModel$loadData$1$4$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$loadData$1$4$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((ActivateSAViewModel.Application) obj3).OLrzqt();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((ActivateSAViewModel.Application) obj3).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj4);
                    }
                };
                activity = new InterfaceC49371unL.Activity(viewDataChanged);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 11;
                if (activateSAViewModel.KWHzl(activateSAViewModel$loadData$1$4$2, activity, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 11:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
