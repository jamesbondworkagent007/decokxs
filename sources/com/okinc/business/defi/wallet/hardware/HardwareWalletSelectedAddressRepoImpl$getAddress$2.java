package com.okinc.business.defi.wallet.hardware;

import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C10854bwM;
import o.C15372eFx;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.InterfaceC57031yaj;
import o.InterfaceC57034yam;
import o.InterfaceC57035yan;
import o.InterfaceC57036yao;
import o.InterfaceC57037yap;
import o.InterfaceC57038yaq;
import o.InterfaceC57042yau;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectedAddressRepoImpl$getAddress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C15372eFx.ActionBar>, Object> {
    final /* synthetic */ int $addressType;
    final /* synthetic */ boolean $chainCode;
    final /* synthetic */ C10854bwM $chainMeta;
    final /* synthetic */ InterfaceC57036yao $commander;
    final /* synthetic */ boolean $display;
    final /* synthetic */ String $path;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectedAddressRepoImpl$getAddress$2(C10854bwM c10854bwM, InterfaceC57036yao interfaceC57036yao, String str, boolean z, boolean z2, int i, Continuation<? super HardwareWalletSelectedAddressRepoImpl$getAddress$2> continuation) {
        super(2, continuation);
        this.$chainMeta = c10854bwM;
        this.$commander = interfaceC57036yao;
        this.$path = str;
        this.$display = z;
        this.$chainCode = z2;
        this.$addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectedAddressRepoImpl$getAddress$2(this.$chainMeta, this.$commander, this.$path, this.$display, this.$chainCode, this.$addressType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C15372eFx.ActionBar> continuation) {
        return ((HardwareWalletSelectedAddressRepoImpl$getAddress$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC57031yaj interfaceC57031yajEZpvd;
        InterfaceC57038yaq interfaceC57038yaqKWHzl;
        InterfaceC57042yau interfaceC57042yauValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10854bwM c10854bwM = this.$chainMeta;
            InterfaceC57036yao interfaceC57036yao = this.$commander;
            String str = this.$path;
            boolean z = this.$display;
            boolean z2 = this.$chainCode;
            int i2 = this.$addressType;
            this.L$0 = c10854bwM;
            this.L$1 = interfaceC57036yao;
            this.L$2 = str;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.I$0 = i2;
            this.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
            InterfaceC57034yam interfaceC57034yamAEQbTJ = null;
            if (c10854bwM.ejfBZ() || c10854bwM.ffGIBT()) {
                InterfaceC57035yan interfaceC57035yanOLrzqt = interfaceC57036yao != null ? InterfaceC57036yao.Companion.OLrzqt(interfaceC57036yao) : null;
                if (interfaceC57035yanOLrzqt != null) {
                    interfaceC57035yanOLrzqt.KWHzl(str, z, z2, new Activity(c56434yFf), new ActionBar(c56434yFf));
                }
            }
            if (c10854bwM.fdOvFl()) {
                InterfaceC57037yap interfaceC57037yapCopydefault = interfaceC57036yao != null ? InterfaceC57036yao.Companion.copydefault(interfaceC57036yao) : null;
                if (interfaceC57037yapCopydefault != null) {
                    interfaceC57037yapCopydefault.OLrzqt(str, false, new TaskDescription(c56434yFf), new Application(c56434yFf));
                }
            }
            if (c10854bwM.run() && interfaceC57036yao != null && (interfaceC57042yauValueOf = InterfaceC57036yao.Companion.valueOf(interfaceC57036yao)) != null) {
                interfaceC57042yauValueOf.AEQbTJ(str, false, new Fragment(c56434yFf), new Dialog(c56434yFf));
            }
            if (c10854bwM.DXXBbs() && interfaceC57036yao != null && (interfaceC57038yaqKWHzl = InterfaceC57036yao.Companion.KWHzl(interfaceC57036yao)) != null) {
                interfaceC57038yaqKWHzl.KWHzl(str, LedgerSignHelper.AEQbTJ.EZpvd(c10854bwM), false, new FragmentManager(c56434yFf), new PendingIntent(c56434yFf));
            }
            if (c10854bwM.call()) {
                String strEZpvd = LedgerSignHelper.AEQbTJ.EZpvd(i2);
                if (c10854bwM.AxsJAYaxsJAY()) {
                    if (interfaceC57036yao != null) {
                        interfaceC57031yajEZpvd = InterfaceC57036yao.Companion.EZpvd(interfaceC57036yao);
                    }
                    if (interfaceC57031yajEZpvd != null) {
                        interfaceC57031yajEZpvd.EZpvd(str, false, strEZpvd, new LoaderManager(c56434yFf), new StateListAnimator(i2, str, strEZpvd, c56434yFf));
                    }
                } else if (interfaceC57036yao != null) {
                    interfaceC57034yamAEQbTJ = InterfaceC57036yao.Companion.AEQbTJ(interfaceC57036yao);
                }
                interfaceC57031yajEZpvd = interfaceC57034yamAEQbTJ;
                if (interfaceC57031yajEZpvd != null) {
                }
            }
            obj = c56434yFf.KWHzl();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static final class ActionBar implements Function1<LedgerError, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.AEQbTJ = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LedgerError ledgerError) {
            OLrzqt(ledgerError);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            pUU.copydefault(">>>ledger getAddress error thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress:" + ledgerError);
            Continuation<C15372eFx.ActionBar> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, null, ledgerError, 3, null)));
        }
    }

    public static final class Activity implements yHO<String, String, String, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.OLrzqt = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(String str, String str2, String str3) {
            AEQbTJ(str, str2, str3);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            pUU.OLrzqt(">>>ledger getAddress thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress chainAddress:" + str2);
            Continuation<C15372eFx.ActionBar> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(str, str2, null)));
        }
    }

    public static final class Application implements Function1<LedgerError, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.EZpvd = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LedgerError ledgerError) {
            OLrzqt(ledgerError);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            pUU.copydefault(">>>ledger SOL getAddress error thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress:" + ledgerError);
            Continuation<C15372eFx.ActionBar> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, null, ledgerError, 3, null)));
        }
    }

    public static final class TaskDescription implements Function1<String, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.copydefault = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            AEQbTJ(str);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.OLrzqt(">>>ledger SOL getAddress thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress chainAddress:" + str);
            Continuation<C15372eFx.ActionBar> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, str, null, 1, null)));
        }
    }

    public static final class Dialog implements Function1<LedgerError, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.copydefault = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LedgerError ledgerError) {
            EZpvd(ledgerError);
            return Unit.INSTANCE;
        }

        public final void EZpvd(LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            pUU.copydefault(">>>ledger isTRX error thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress:" + ledgerError);
            Continuation<C15372eFx.ActionBar> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, null, ledgerError, 3, null)));
        }
    }

    public static final class Fragment implements Function2<String, String, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.OLrzqt = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(String str, String str2) {
            OLrzqt(str, str2);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Continuation<C15372eFx.ActionBar> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(str, str2, null)));
        }
    }

    public static final class FragmentManager implements Function2<String, String, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.copydefault = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(String str, String str2) {
            AEQbTJ(str, str2);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Continuation<C15372eFx.ActionBar> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(str, str2, null)));
        }
    }

    public static final class PendingIntent implements Function1<LedgerError, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public PendingIntent(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.copydefault = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LedgerError ledgerError) {
            AEQbTJ(ledgerError);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            pUU.copydefault(">>>ledger isCosmosCompatible error thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress:" + ledgerError);
            Continuation<C15372eFx.ActionBar> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, null, ledgerError, 3, null)));
        }
    }

    public static final class LoaderManager implements yHO<String, String, String, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(Continuation<? super C15372eFx.ActionBar> continuation) {
            this.OLrzqt = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(String str, String str2, String str3) {
            AEQbTJ(str, str2, str3);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Continuation<C15372eFx.ActionBar> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(str, str2, null)));
        }
    }

    public static final class StateListAnimator implements Function1<LedgerError, Unit> {
        public final /* synthetic */ Continuation<C15372eFx.ActionBar> AEQbTJ;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.coroutines.Continuation<? super o.eFx$ActionBar> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(int i, String str, String str2, Continuation<? super C15372eFx.ActionBar> continuation) {
            this.KWHzl = i;
            this.copydefault = str;
            this.OLrzqt = str2;
            this.AEQbTJ = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LedgerError ledgerError) {
            EZpvd(ledgerError);
            return Unit.INSTANCE;
        }

        public final void EZpvd(LedgerError ledgerError) {
            Intrinsics.checkNotNullParameter(ledgerError, "");
            AddressData addressData = new AddressData(this.KWHzl, false, false, null, 14, null);
            pUU.copydefault(">>>ledger isUTXO error thread:" + Thread.currentThread() + " getAddressFromLedger cmd.getAddress:" + ledgerError + " - path:" + this.copydefault + " - format:" + this.OLrzqt + " - Type:" + addressData.getAddressFormat());
            Continuation<C15372eFx.ActionBar> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(new C15372eFx.ActionBar(null, null, ledgerError, 3, null)));
        }
    }
}
