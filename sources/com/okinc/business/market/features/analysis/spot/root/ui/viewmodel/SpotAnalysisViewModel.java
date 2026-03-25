package com.okinc.business.market.features.analysis.spot.root.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC47278tmy;
import o.InterfaceC49371unL;
import o.InterfaceC8218ayb;
import o.InterfaceC8222ayf;
import o.InterfaceC8225ayi;
import o.jHT;
import o.jHV;
import o.jLI;
import o.jLJ;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisViewModel extends AbstractC49411unz<jLJ> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC47278tmy AEQbTJ;
    public final jHV EZpvd;
    public final InterfaceC8225ayi KWHzl;
    public final InterfaceC8218ayb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8218ayb AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8225ayi OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SpotAnalysisViewModel(@NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull InterfaceC8225ayi interfaceC8225ayi, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull jHV jhv) {
        super(new jLJ(null, null, interfaceC8218ayb.OLrzqt().getValue(), null, 11, null));
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(interfaceC8225ayi, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(jhv, "");
        this.copydefault = interfaceC8218ayb;
        this.KWHzl = interfaceC8225ayi;
        this.AEQbTJ = interfaceC47278tmy;
        this.EZpvd = jhv;
        KWHzl();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Object EZpvd(@NotNull HashMap<Integer, InterfaceC49371unL<Unit>> map, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel$updateComponentStateMap$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((jLJ) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((jLJ) obj).EZpvd((HashMap<Integer, InterfaceC49371unL<Unit>>) obj2);
            }
        }, map, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AYXKKw(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        SpotAnalysisViewModel$onRefresh$1 spotAnalysisViewModel$onRefresh$1;
        SpotAnalysisViewModel spotAnalysisViewModel;
        if (continuation instanceof SpotAnalysisViewModel$onRefresh$1) {
            spotAnalysisViewModel$onRefresh$1 = (SpotAnalysisViewModel$onRefresh$1) continuation;
            int i = spotAnalysisViewModel$onRefresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$onRefresh$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$onRefresh$1 = new SpotAnalysisViewModel$onRefresh$1(this, continuation);
            }
        }
        Object obj = spotAnalysisViewModel$onRefresh$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$onRefresh$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("SpotAnalysisViewModel", "onRefresh: Setting componentStateMap to Loading");
            HashMap<Integer, InterfaceC49371unL<Unit>> mapAEQbTJ = jLJ.Companion.AEQbTJ();
            spotAnalysisViewModel$onRefresh$1.L$0 = this;
            spotAnalysisViewModel$onRefresh$1.label = 1;
            if (EZpvd(mapAEQbTJ, spotAnalysisViewModel$onRefresh$1) == objCopydefault) {
                return objCopydefault;
            }
            spotAnalysisViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spotAnalysisViewModel = (SpotAnalysisViewModel) spotAnalysisViewModel$onRefresh$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        spotAnalysisViewModel.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super HashMap<Integer, InterfaceC49371unL<Unit>>> continuation) throws Throwable {
        SpotAnalysisViewModel$deepCopyComponentStateMap$1 spotAnalysisViewModel$deepCopyComponentStateMap$1;
        HashMap map;
        if (continuation instanceof SpotAnalysisViewModel$deepCopyComponentStateMap$1) {
            spotAnalysisViewModel$deepCopyComponentStateMap$1 = (SpotAnalysisViewModel$deepCopyComponentStateMap$1) continuation;
            int i = spotAnalysisViewModel$deepCopyComponentStateMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$deepCopyComponentStateMap$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$deepCopyComponentStateMap$1 = new SpotAnalysisViewModel$deepCopyComponentStateMap$1(this, continuation);
            }
        }
        Object obj = spotAnalysisViewModel$deepCopyComponentStateMap$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$deepCopyComponentStateMap$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap map2 = new HashMap();
            spotAnalysisViewModel$deepCopyComponentStateMap$1.L$0 = map2;
            spotAnalysisViewModel$deepCopyComponentStateMap$1.label = 1;
            Object objOLrzqt = OLrzqt(this, spotAnalysisViewModel$deepCopyComponentStateMap$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            map = map2;
            obj = objOLrzqt;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (HashMap) spotAnalysisViewModel$deepCopyComponentStateMap$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        for (Map.Entry<Integer, InterfaceC49371unL<Unit>> entry : ((jLJ) obj).EZpvd().entrySet()) {
            map.put(C56443yFo.AEQbTJ(entry.getKey().intValue()), entry.getValue());
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [55=4] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        SpotAnalysisViewModel$setAccountSort$1 spotAnalysisViewModel$setAccountSort$1;
        SpotAnalysisViewModel spotAnalysisViewModel;
        SpotAnalysisViewModel spotAnalysisViewModel2;
        Object objCopydefault;
        String str2;
        String str3;
        Object objOLrzqt;
        String str4;
        SpotAnalysisViewModel spotAnalysisViewModel3;
        String str5;
        if (continuation instanceof SpotAnalysisViewModel$setAccountSort$1) {
            spotAnalysisViewModel$setAccountSort$1 = (SpotAnalysisViewModel$setAccountSort$1) continuation;
            int i = spotAnalysisViewModel$setAccountSort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$setAccountSort$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$setAccountSort$1 = new SpotAnalysisViewModel$setAccountSort$1(this, continuation);
            }
        }
        Object objOLrzqt2 = spotAnalysisViewModel$setAccountSort$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$setAccountSort$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt2);
            spotAnalysisViewModel$setAccountSort$1.L$0 = this;
            spotAnalysisViewModel$setAccountSort$1.L$1 = str;
            spotAnalysisViewModel$setAccountSort$1.label = 1;
            objOLrzqt2 = OLrzqt(this, spotAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault2) {
                return objCopydefault2;
            }
            spotAnalysisViewModel = this;
        } else if (i2 == 1) {
            str = (String) spotAnalysisViewModel$setAccountSort$1.L$1;
            spotAnalysisViewModel = (SpotAnalysisViewModel) spotAnalysisViewModel$setAccountSort$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    spotAnalysisViewModel2 = (SpotAnalysisViewModel) spotAnalysisViewModel$setAccountSort$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt2);
                    String str6 = (String) objOLrzqt2;
                    spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
                    spotAnalysisViewModel$setAccountSort$1.L$1 = str6;
                    spotAnalysisViewModel$setAccountSort$1.label = 4;
                    objCopydefault = spotAnalysisViewModel2.copydefault(spotAnalysisViewModel$setAccountSort$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str2 = str6;
                    objOLrzqt2 = objCopydefault;
                    str3 = (String) objOLrzqt2;
                    if (str2 != null) {
                        spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
                        spotAnalysisViewModel$setAccountSort$1.L$1 = str2;
                        spotAnalysisViewModel$setAccountSort$1.L$2 = str3;
                        spotAnalysisViewModel$setAccountSort$1.label = 5;
                        objOLrzqt = spotAnalysisViewModel2.OLrzqt(spotAnalysisViewModel$setAccountSort$1);
                        if (objOLrzqt != objCopydefault2) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) spotAnalysisViewModel$setAccountSort$1.L$2;
                    str4 = (String) spotAnalysisViewModel$setAccountSort$1.L$1;
                    spotAnalysisViewModel3 = (SpotAnalysisViewModel) spotAnalysisViewModel$setAccountSort$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt2);
                    jHT jht = (jHT) objOLrzqt2;
                    spotAnalysisViewModel3.KWHzl.AEQbTJ((jht == null && jht.copydefault()) ? new InterfaceC8222ayf.Application(str5) : new InterfaceC8222ayf.ActionBar(str5), str4);
                    return Unit.INSTANCE;
                }
                String str7 = (String) spotAnalysisViewModel$setAccountSort$1.L$1;
                SpotAnalysisViewModel spotAnalysisViewModel4 = (SpotAnalysisViewModel) spotAnalysisViewModel$setAccountSort$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt2);
                str2 = str7;
                spotAnalysisViewModel2 = spotAnalysisViewModel4;
                str3 = (String) objOLrzqt2;
                if (str2 != null && str3 != null) {
                    spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
                    spotAnalysisViewModel$setAccountSort$1.L$1 = str2;
                    spotAnalysisViewModel$setAccountSort$1.L$2 = str3;
                    spotAnalysisViewModel$setAccountSort$1.label = 5;
                    objOLrzqt = spotAnalysisViewModel2.OLrzqt(spotAnalysisViewModel$setAccountSort$1);
                    if (objOLrzqt != objCopydefault2) {
                        return objCopydefault2;
                    }
                    str4 = str2;
                    spotAnalysisViewModel3 = spotAnalysisViewModel2;
                    str5 = str3;
                    objOLrzqt2 = objOLrzqt;
                    jHT jht2 = (jHT) objOLrzqt2;
                    if (jht2 == null) {
                        spotAnalysisViewModel3.KWHzl.AEQbTJ((jht2 == null && jht2.copydefault()) ? new InterfaceC8222ayf.Application(str5) : new InterfaceC8222ayf.ActionBar(str5), str4);
                    }
                }
                return Unit.INSTANCE;
            }
            spotAnalysisViewModel2 = (SpotAnalysisViewModel) spotAnalysisViewModel$setAccountSort$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
            spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
            spotAnalysisViewModel$setAccountSort$1.label = 3;
            objOLrzqt2 = spotAnalysisViewModel2.AEQbTJ(spotAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault2) {
                return objCopydefault2;
            }
            String str62 = (String) objOLrzqt2;
            spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
            spotAnalysisViewModel$setAccountSort$1.L$1 = str62;
            spotAnalysisViewModel$setAccountSort$1.label = 4;
            objCopydefault = spotAnalysisViewModel2.copydefault(spotAnalysisViewModel$setAccountSort$1);
            if (objCopydefault == objCopydefault2) {
            }
        }
        jLJ jlj = (jLJ) objOLrzqt2;
        if (!Intrinsics.EZpvd((Object) jlj.AEQbTJ().KWHzl(), (Object) str)) {
            jLI jliCopy$default = jLI.copy$default(jlj.AEQbTJ(), null, str, 1, null);
            spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel;
            spotAnalysisViewModel$setAccountSort$1.L$1 = null;
            spotAnalysisViewModel$setAccountSort$1.label = 2;
            if (spotAnalysisViewModel.KWHzl(jliCopy$default, spotAnalysisViewModel$setAccountSort$1) == objCopydefault2) {
                return objCopydefault2;
            }
            spotAnalysisViewModel2 = spotAnalysisViewModel;
            spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
            spotAnalysisViewModel$setAccountSort$1.label = 3;
            objOLrzqt2 = spotAnalysisViewModel2.AEQbTJ(spotAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault2) {
            }
            String str622 = (String) objOLrzqt2;
            spotAnalysisViewModel$setAccountSort$1.L$0 = spotAnalysisViewModel2;
            spotAnalysisViewModel$setAccountSort$1.L$1 = str622;
            spotAnalysisViewModel$setAccountSort$1.label = 4;
            objCopydefault = spotAnalysisViewModel2.copydefault(spotAnalysisViewModel$setAccountSort$1);
            if (objCopydefault == objCopydefault2) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super jHT> continuation) throws Throwable {
        SpotAnalysisViewModel$getSelectedAccount$1 spotAnalysisViewModel$getSelectedAccount$1;
        if (continuation instanceof SpotAnalysisViewModel$getSelectedAccount$1) {
            spotAnalysisViewModel$getSelectedAccount$1 = (SpotAnalysisViewModel$getSelectedAccount$1) continuation;
            int i = spotAnalysisViewModel$getSelectedAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$getSelectedAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$getSelectedAccount$1 = new SpotAnalysisViewModel$getSelectedAccount$1(this, continuation);
            }
        }
        Object objOLrzqt = spotAnalysisViewModel$getSelectedAccount$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$getSelectedAccount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            spotAnalysisViewModel$getSelectedAccount$1.label = 1;
            objOLrzqt = OLrzqt(this, spotAnalysisViewModel$getSelectedAccount$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((jLJ) objOLrzqt).AEQbTJ().OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super String> continuation) throws Throwable {
        SpotAnalysisViewModel$getSelectedAccountUid$1 spotAnalysisViewModel$getSelectedAccountUid$1;
        if (continuation instanceof SpotAnalysisViewModel$getSelectedAccountUid$1) {
            spotAnalysisViewModel$getSelectedAccountUid$1 = (SpotAnalysisViewModel$getSelectedAccountUid$1) continuation;
            int i = spotAnalysisViewModel$getSelectedAccountUid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$getSelectedAccountUid$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$getSelectedAccountUid$1 = new SpotAnalysisViewModel$getSelectedAccountUid$1(this, continuation);
            }
        }
        Object objOLrzqt = spotAnalysisViewModel$getSelectedAccountUid$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$getSelectedAccountUid$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            spotAnalysisViewModel$getSelectedAccountUid$1.label = 1;
            objOLrzqt = OLrzqt(this, spotAnalysisViewModel$getSelectedAccountUid$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((jLJ) objOLrzqt).AEQbTJ().KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super String> continuation) throws Throwable {
        SpotAnalysisViewModel$getSelectedAccountEmail$1 spotAnalysisViewModel$getSelectedAccountEmail$1;
        if (continuation instanceof SpotAnalysisViewModel$getSelectedAccountEmail$1) {
            spotAnalysisViewModel$getSelectedAccountEmail$1 = (SpotAnalysisViewModel$getSelectedAccountEmail$1) continuation;
            int i = spotAnalysisViewModel$getSelectedAccountEmail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$getSelectedAccountEmail$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$getSelectedAccountEmail$1 = new SpotAnalysisViewModel$getSelectedAccountEmail$1(this, continuation);
            }
        }
        Object objOLrzqt = spotAnalysisViewModel$getSelectedAccountEmail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$getSelectedAccountEmail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            spotAnalysisViewModel$getSelectedAccountEmail$1.label = 1;
            objOLrzqt = OLrzqt(this, spotAnalysisViewModel$getSelectedAccountEmail$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        jHT jhtOLrzqt = ((jLJ) objOLrzqt).AEQbTJ().OLrzqt();
        if (jhtOLrzqt != null) {
            return jhtOLrzqt.OLrzqt();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super List<jHT>> continuation) throws Throwable {
        SpotAnalysisViewModel$getAccountList$1 spotAnalysisViewModel$getAccountList$1;
        if (continuation instanceof SpotAnalysisViewModel$getAccountList$1) {
            spotAnalysisViewModel$getAccountList$1 = (SpotAnalysisViewModel$getAccountList$1) continuation;
            int i = spotAnalysisViewModel$getAccountList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisViewModel$getAccountList$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisViewModel$getAccountList$1 = new SpotAnalysisViewModel$getAccountList$1(this, continuation);
            }
        }
        Object objOLrzqt = spotAnalysisViewModel$getAccountList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisViewModel$getAccountList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            spotAnalysisViewModel$getAccountList$1.label = 1;
            objOLrzqt = OLrzqt(this, spotAnalysisViewModel$getAccountList$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((jLJ) objOLrzqt).AEQbTJ().AEQbTJ();
    }

    public final void KWHzl() {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotAnalysisViewModel$loadAccountListData$1(this, null), 3, null), "loadAccountListData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object KWHzl(jLI jli, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.root.ui.viewmodel.SpotAnalysisViewModel$updateAccountState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((jLJ) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((jLJ) obj).EZpvd((jLI) obj2);
            }
        }, jli, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
