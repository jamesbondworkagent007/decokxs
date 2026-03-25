package com.engagelab.privates.analysis;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.analysis.api.MTAnalysisPrivatesApi;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.a;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.b;
import com.engagelab.privates.common.c;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.d;
import com.engagelab.privates.common.e;
import com.engagelab.privates.common.g;
import com.engagelab.privates.common.h;
import com.engagelab.privates.common.observer.MTObserver;

/* JADX INFO: loaded from: classes21.dex */
public class MTAnalysis extends MTObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f319a = MTCommonConstants.getLogTag() + "ANALYSIS";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        MTCommonPrivatesApi.sendMessage(context, f319a, i, bundle);
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public short getSdkFlag() {
        return (short) 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkName() {
        return "statistics_sdk_ver";
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public int getSdkPriority() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkVersion() {
        return MTAnalysisPrivatesApi.SDK_VERSION_NAME;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{f319a};
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSdk() {
        return true;
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        if (i == 1005 || i == 1006 || i == 1011 || i == 1016 || i == 1013 || i == 1014 || i == 3201 || i == 3202) {
            return true;
        }
        switch (i) {
            case MTAnalysisConstants.MainWhat.INIT /* 4001 */:
            case MTAnalysisConstants.MainWhat.ON_EVENT /* 4002 */:
            case MTAnalysisConstants.MainWhat.ON_ACCOUNT /* 4003 */:
            case MTAnalysisConstants.MainWhat.ON_REPORT /* 4004 */:
            case MTAnalysisConstants.MainWhat.ON_DRAW_DONE /* 4005 */:
                return true;
            default:
                switch (i) {
                    case MTAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                    case MTAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                    case MTAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                    case MTAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        if (i == 1005) {
            b.a().c(context);
            return;
        }
        if (i == 1006) {
            b.a().b(context);
            return;
        }
        if (i == 1011) {
            e.a().a(context, bundle);
            return;
        }
        if (i == 1016) {
            e.a().b(context, bundle);
            return;
        }
        if (i != 2003) {
            if (i == 1013) {
                e.a().d(context, bundle);
                return;
            }
            if (i == 1014) {
                e.a().c(context, bundle);
                return;
            }
            if (i == 3201) {
                g.a().a(context, bundle);
                return;
            }
            if (i == 3202) {
                g.a().b(context, bundle);
                return;
            }
            switch (i) {
                case MTAnalysisConstants.MainWhat.INIT /* 4001 */:
                    c.a().a(context);
                    b.a().a(context);
                    a.a().a(context);
                    break;
                case MTAnalysisConstants.MainWhat.ON_EVENT /* 4002 */:
                    d.c().a(context, bundle);
                    break;
                case MTAnalysisConstants.MainWhat.ON_ACCOUNT /* 4003 */:
                    a.a().a(context, bundle);
                    break;
                case MTAnalysisConstants.MainWhat.ON_REPORT /* 4004 */:
                    break;
                case MTAnalysisConstants.MainWhat.ON_DRAW_DONE /* 4005 */:
                    e.a().a(context);
                    break;
                default:
                    switch (i) {
                        case MTAnalysisConstants.MainWhat.SET_STATIC_PROPERTY /* 4101 */:
                            d.c().b(context, bundle);
                            break;
                        case MTAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY /* 4102 */:
                            d.c().a(context);
                            break;
                        case MTAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY /* 4103 */:
                            d.c().c(context, bundle);
                            break;
                        case MTAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY /* 4104 */:
                            d.c().b(context);
                            break;
                    }
                    break;
            }
            return;
        }
        h.a().a(context);
    }
}
