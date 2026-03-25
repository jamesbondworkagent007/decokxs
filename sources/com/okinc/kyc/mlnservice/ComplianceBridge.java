package com.okinc.kyc.mlnservice;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.kyc.mlnservice.ComplianceBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.C43248rlh;
import o.C7322ahe;
import o.InterfaceC37981pHw;
import o.pUU;
import o.rTU;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class ComplianceBridge {
    public static final String LUA_CLASS_NAME = "OKComplianceBridge";
    public Globals globals;

    public ComplianceBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void gotoKycOnboarding(LuaValue[] luaValueArr) {
        try {
            Context contextOLrzqt = OLrzqt(this.globals);
            if (contextOLrzqt == null || !(contextOLrzqt instanceof FragmentActivity)) {
                pUU.KWHzl("OKComplianceBridge gotoKycOnboardingFromLua", "context = " + contextOLrzqt);
                return;
            }
            if (luaValueArr != null) {
                boolean z = luaValueArr.length >= 1 ? luaValueArr[0].toBoolean() : true;
                final LuaFunction luaFunction = luaValueArr.length >= 2 ? luaValueArr[1].toLuaFunction() : null;
                final LuaFunction luaFunction2 = luaValueArr.length >= 3 ? luaValueArr[2].toLuaFunction() : null;
                ((rTU) C43248rlh.KWHzl.AEQbTJ(rTU.class)).copydefault((FragmentActivity) contextOLrzqt, z, new Function2() { // from class: o.pHG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return ComplianceBridge.AEQbTJ(luaFunction, (java.lang.Boolean) obj, (java.lang.String) obj2);
                    }
                }, new Function1() { // from class: o.pHF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ComplianceBridge.OLrzqt(luaFunction2, (java.lang.Integer) obj);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Unit AEQbTJ(LuaFunction luaFunction, Boolean bool, String str) {
        if (luaFunction == null) {
            return null;
        }
        luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(bool.booleanValue()), LuaString.copydefault(str)));
        return null;
    }

    public static /* synthetic */ Unit OLrzqt(LuaFunction luaFunction, Integer num) {
        if (luaFunction == null) {
            return null;
        }
        luaFunction.invoke(LuaValue.rNumber(num.intValue()));
        return null;
    }

    public Context OLrzqt(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public void getKycLevelWithCache(final LuaFunction luaFunction) {
        Context contextOLrzqt = OLrzqt(this.globals);
        if (contextOLrzqt != null && (contextOLrzqt instanceof AppCompatActivity)) {
            ((InterfaceC37981pHw) C43248rlh.KWHzl.AEQbTJ(InterfaceC37981pHw.class)).EZpvd((AppCompatActivity) contextOLrzqt, new Function1<KycInfoListBean, Unit>() { // from class: com.okinc.kyc.mlnservice.ComplianceBridge.1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public Unit invoke(KycInfoListBean kycInfoListBean) {
                    KycInfoListBean.PersonalBean personal = kycInfoListBean.getPersonal();
                    if (personal != null) {
                        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(personal.getLevel()), LuaValue.Nil()));
                        return null;
                    }
                    KycInfoListBean.CompanyBean company = kycInfoListBean.getCompany();
                    if (company != null) {
                        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(company.getLevel()), LuaValue.Nil()));
                        return null;
                    }
                    pUU.KWHzl("OKComplianceBridge getKycInfoWithCache", "personal = null && company = null");
                    luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1), LuaValue.Nil()));
                    return null;
                }
            }, new Function1<String, Unit>() { // from class: com.okinc.kyc.mlnservice.ComplianceBridge.3
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public Unit invoke(String str) {
                    pUU.KWHzl("OKComplianceBridge getKycInfoWithCache", "errorMsg = " + str);
                    luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1), LuaString.copydefault(str)));
                    return null;
                }
            });
            return;
        }
        pUU.KWHzl("OKComplianceBridge getKycInfoWithCache", "context = " + contextOLrzqt);
    }

    @LuaBridge
    public void fetchKycLevelInfo(final LuaFunction luaFunction) {
        Context contextOLrzqt = OLrzqt(this.globals);
        if (contextOLrzqt != null && (contextOLrzqt instanceof AppCompatActivity)) {
            ((InterfaceC37981pHw) C43248rlh.KWHzl.AEQbTJ(InterfaceC37981pHw.class)).copydefault((AppCompatActivity) contextOLrzqt, new Function1<KycInfoListBean, Unit>() { // from class: com.okinc.kyc.mlnservice.ComplianceBridge.2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public Unit invoke(KycInfoListBean kycInfoListBean) {
                    KycInfoListBean.PersonalBean personal = kycInfoListBean.getPersonal();
                    if (personal != null) {
                        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(personal.getLevel()), LuaValue.Nil()));
                        return null;
                    }
                    KycInfoListBean.CompanyBean company = kycInfoListBean.getCompany();
                    if (company != null) {
                        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(company.getLevel()), LuaValue.Nil()));
                        return null;
                    }
                    pUU.KWHzl("OKComplianceBridge fetchKycInfo", "personal = null && company = null");
                    luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1), LuaValue.Nil()));
                    return null;
                }
            }, new Function1<String, Unit>() { // from class: com.okinc.kyc.mlnservice.ComplianceBridge.5
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public Unit invoke(String str) {
                    pUU.KWHzl("OKComplianceBridge fetchKycInfo", "errorMsg = " + str);
                    luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1), LuaString.copydefault(str)));
                    return null;
                }
            });
            return;
        }
        pUU.KWHzl("OKComplianceBridge fetchKycInfo", "context = " + contextOLrzqt);
    }
}
