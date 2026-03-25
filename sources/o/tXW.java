package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okuser.data.PersonalSetting;
import com.okinc.okuser.data.User;
import com.okinc.preference.data.model.meta.UserMetaInfo;
import com.okinc.preference.data.remote.UserMetaInfoRemoteDataSource;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C46541tYd;

/* JADX INFO: loaded from: classes16.dex */
public final class tXW {
    public static UserMetaInfo EZpvd;
    public static final tXW AEQbTJ = new tXW();
    public static final int copydefault = 8;

    private tXW() {
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.preference.data.remote.UserMetaInfoRemoteDataSource.TaskDescription.loadUserMetaInfo$default(com.okinc.preference.data.remote.UserMetaInfoRemoteDataSource, boolean, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<ResponseData<UserMetaInfo>> AEQbTJ() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(UserMetaInfoRemoteDataSource.TaskDescription.loadUserMetaInfo$default(UserMetaInfoRemoteDataSource.Companion.OLrzqt(), false, 1, null));
        final Function1 function1 = new Function1() { // from class: o.tXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tXW.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<UserMetaInfo>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.tXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return tXW.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(ResponseData responseData) {
        PersonalSetting personalSetting;
        Intrinsics.checkNotNullParameter(responseData, "");
        EZpvd = (UserMetaInfo) responseData.getData();
        InterfaceC47278tmy interfaceC47278tmyFmB = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
        User userOLrzqt = interfaceC47278tmyFmB.OLrzqt();
        if (userOLrzqt != null) {
            UserMetaInfo userMetaInfo = (UserMetaInfo) responseData.getData();
            userOLrzqt.setInfo(userMetaInfo != null ? userMetaInfo.getUserInfo() : null);
            UserMetaInfo userMetaInfo2 = (UserMetaInfo) responseData.getData();
            userOLrzqt.setPersonalSetting(userMetaInfo2 != null ? userMetaInfo2.getPersonalSetting() : null);
            interfaceC47278tmyFmB.EZpvd(userOLrzqt);
            RxBus.KWHzl("user_info_change");
        }
        UserMetaInfo userMetaInfo3 = (UserMetaInfo) responseData.getData();
        if (userMetaInfo3 != null && (personalSetting = userMetaInfo3.getPersonalSetting()) != null) {
            InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
            if (interfaceC46553tYp != null) {
                interfaceC46553tYp.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), personalSetting.getChargeUnit(), false);
            }
            InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
            if (interfaceC46557tYt != null) {
                interfaceC46557tYt.KWHzl(personalSetting.getUpDownTimeZone());
            }
            RxBus.AEQbTJ(new C46541tYd.TaskDescription(personalSetting));
        }
        return responseData;
    }
}
