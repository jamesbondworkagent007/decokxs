package o;

import com.okinc.im.usecase.relationlist.GetPhoneContactListUseCase$execute$1;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35866oGp {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final sKN OLrzqt;

    @yCM
    public C35866oGp(@NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(skn, "");
        this.OLrzqt = skn;
    }

    /* JADX INFO: renamed from: o.oGp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<C37246oqH>> continuation) throws java.lang.Throwable {
        GetPhoneContactListUseCase$execute$1 getPhoneContactListUseCase$execute$1;
        C35551nxW c35551nxW;
        if (continuation instanceof GetPhoneContactListUseCase$execute$1) {
            getPhoneContactListUseCase$execute$1 = (GetPhoneContactListUseCase$execute$1) continuation;
            int i = getPhoneContactListUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPhoneContactListUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getPhoneContactListUseCase$execute$1 = new GetPhoneContactListUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getPhoneContactListUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPhoneContactListUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            c35551nxW = C35551nxW.copydefault;
            sKN skn = this.OLrzqt;
            getPhoneContactListUseCase$execute$1.L$0 = c35551nxW;
            getPhoneContactListUseCase$execute$1.label = 1;
            objEZpvd = skn.EZpvd(getPhoneContactListUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.List list = (java.util.List) objEZpvd;
                pUU.KWHzl("GetPhoneContactListUseCase", "grouped result list size: " + list.size());
                return list;
            }
            c35551nxW = (C35551nxW) getPhoneContactListUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.lang.Iterable<PhoneRelationGroup> iterable = (java.lang.Iterable) objEZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (PhoneRelationGroup phoneRelationGroup : iterable) {
            arrayList.add(new C37246oqH(phoneRelationGroup.getContactId(), phoneRelationGroup.getDisplayName(), phoneRelationGroup.getLocalRelationList()));
        }
        getPhoneContactListUseCase$execute$1.L$0 = null;
        getPhoneContactListUseCase$execute$1.label = 2;
        objEZpvd = c35551nxW.copydefault(arrayList, getPhoneContactListUseCase$execute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        java.util.List list2 = (java.util.List) objEZpvd;
        pUU.KWHzl("GetPhoneContactListUseCase", "grouped result list size: " + list2.size());
        return list2;
    }
}
