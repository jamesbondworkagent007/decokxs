package com.okinc.im.imui.relationlist.viewmodel.addcontact;

import com.okinc.im.imui.relationlist.model.AddContactOption;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C33070mpX;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.oFR;
import o.oFU;
import o.oFY;
import o.pUU;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public final class AddContactViewModel$searchContact$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ String $email;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddContactViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddContactOption.values().length];
            try {
                iArr[AddContactOption.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddContactOption.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddContactOption.UID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddContactViewModel$searchContact$1(AddContactViewModel addContactViewModel, String str, String str2, String str3, String str4, Continuation<? super AddContactViewModel$searchContact$1> continuation) {
        super(2, continuation);
        this.this$0 = addContactViewModel;
        this.$countryCode = str;
        this.$phoneNumber = str2;
        this.$email = str3;
        this.$uid = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddContactViewModel$searchContact$1 addContactViewModel$searchContact$1 = new AddContactViewModel$searchContact$1(this.this$0, this.$countryCode, this.$phoneNumber, this.$email, this.$uid, continuation);
        addContactViewModel$searchContact$1.L$0 = obj;
        return addContactViewModel$searchContact$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddContactViewModel$searchContact$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.setValue(C56443yFo.KWHzl(true));
                AddContactViewModel addContactViewModel = this.this$0;
                String str = this.$countryCode;
                String str2 = this.$phoneNumber;
                String str3 = this.$email;
                String str4 = this.$uid;
                Result.Application application = Result.Companion;
                pUU.KWHzl("AddContactViewModel", "Search friend: started");
                int i2 = StateListAnimator.OLrzqt[addContactViewModel.ejfBZ.ordinal()];
                if (i2 == 1) {
                    oFY ofy = addContactViewModel.fARcdN;
                    String strReplace$default = C59449zhJ.replace$default(str, Marker.ANY_NON_NULL_MARKER, "", false, 4, (Object) null);
                    this.label = 1;
                    obj = ofy.EZpvd(strReplace$default, str2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    list = (List) obj;
                } else if (i2 == 2) {
                    oFR ofr = addContactViewModel.fJNWhG;
                    this.label = 2;
                    obj = ofr.copydefault(str3, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    list = (List) obj;
                } else if (i2 == 3) {
                    oFU ofu = addContactViewModel.fIwbmz;
                    long j = Long.parseLong(str4);
                    this.label = 3;
                    obj = ofu.AEQbTJ(j, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    list = (List) obj;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(list);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        AddContactViewModel addContactViewModel2 = this.this$0;
        String str5 = this.$countryCode;
        String str6 = this.$phoneNumber;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            List list2 = (List) objM7377constructorimpl;
            addContactViewModel2.KWHzl.setValue(C56443yFo.KWHzl(false));
            pUU.KWHzl("AddContactViewModel", "Search friend: completed Success");
            if (!list2.isEmpty()) {
                InHouseIMContactInfoEntity inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) list2.get(0);
                addContactViewModel2.EZpvd.setValue(new C32989mnw(new Pair(inHouseIMContactInfoEntity.getContactUid(), inHouseIMContactInfoEntity.getChannelId())));
            } else {
                pUU.KWHzl("AddContactViewModel", "Search friend: completed Success but empty list, start fetching referral data");
                int i3 = StateListAnimator.OLrzqt[addContactViewModel2.ejfBZ.ordinal()];
                if (i3 == 1) {
                    addContactViewModel2.AEQbTJ(str5 + str6);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.copydefault(C33070mpX.AYXKKw(C35399nuc.LoaderManager.TarCU), 1);
                }
            }
        }
        AddContactViewModel addContactViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            addContactViewModel3.KWHzl.setValue(C56443yFo.KWHzl(false));
            String localizedMessage = thM7380exceptionOrNullimpl.getLocalizedMessage();
            if (localizedMessage != null) {
                C55326xho.copydefault(localizedMessage, 1);
            }
            pUU.copydefault("AddContactViewModel", "Search friend failed: " + thM7380exceptionOrNullimpl.getLocalizedMessage());
        }
        return Unit.INSTANCE;
    }
}
