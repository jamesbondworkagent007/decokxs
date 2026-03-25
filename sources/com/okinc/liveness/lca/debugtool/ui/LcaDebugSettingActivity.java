package com.okinc.liveness.lca.debugtool.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.LcaLivenessCheckOnCancel;
import com.okinc.liveness.lca.LcaLivenessCheckOnCloseSelfieView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFarSelfieView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFinalCheckView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFirstFreshnessView;
import com.okinc.liveness.lca.LcaLivenessCheckOnReloadScreenClicked;
import com.okinc.liveness.lca.LcaLivenessCheckOnReloadScreenView;
import com.okinc.liveness.lca.LcaLivenessCheckOnRestartDialogClicked;
import com.okinc.liveness.lca.LcaLivenessCheckOnRetryDialogPop;
import com.okinc.liveness.lca.LcaLivenessCheckOnSocketConnected;
import com.okinc.liveness.lca.LcaLivenessCheckOnStartingUpView;
import com.okinc.liveness.lca.LcaLivenessCheckResult;
import com.okinc.liveness.lca.LcaLivenessCheckSuccess;
import com.okinc.liveness.lca.LcaRgbColorConfig;
import com.okinc.liveness.lca.LcaSdkCollaborator;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.debugtool.data.LcaDebugDataManager;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import com.okinc.liveness.lca.debugtool.utils.LcaDebugChunkFileManager;
import com.okinc.liveness.lca.debugtool.utils.LcaDebugSettingHelper;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.uilab.edit.OKEditText;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C34717nhc;
import o.C45696sus;
import o.C46979thQ;
import o.C47029tiN;
import o.C55328xhq;
import o.InterfaceC46982thT;
import o.InterfaceC47027tiL;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugSettingActivity extends AbstractActivityC33041mov {
    public static final String TAG = "SettingActivity";
    public C45696sus binding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45696sus c45696susCopydefault = C45696sus.copydefault(getLayoutInflater());
        this.binding = c45696susCopydefault;
        C45696sus c45696sus = null;
        if (c45696susCopydefault == null) {
            Intrinsics.gEmmrt("");
            c45696susCopydefault = null;
        }
        setContentView(c45696susCopydefault.getRoot());
        C45696sus c45696sus2 = this.binding;
        if (c45696sus2 == null) {
            Intrinsics.gEmmrt("");
            c45696sus2 = null;
        }
        RadioGroup radioGroup = c45696sus2.fZBcTu;
        C45696sus c45696sus3 = this.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
            c45696sus3 = null;
        }
        radioGroup.check(c45696sus3.zuBGHE.getId());
        C45696sus c45696sus4 = this.binding;
        if (c45696sus4 == null) {
            Intrinsics.gEmmrt("");
            c45696sus4 = null;
        }
        c45696sus4.fZBcTu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                LcaDebugSettingActivity.onCreate$lambda$0(this.f$0, radioGroup2, i);
            }
        });
        C45696sus c45696sus5 = this.binding;
        if (c45696sus5 == null) {
            Intrinsics.gEmmrt("");
            c45696sus5 = null;
        }
        RadioGroup radioGroup2 = c45696sus5.UeEOUB;
        C45696sus c45696sus6 = this.binding;
        if (c45696sus6 == null) {
            Intrinsics.gEmmrt("");
            c45696sus6 = null;
        }
        radioGroup2.check(c45696sus6.AubY.getId());
        C45696sus c45696sus7 = this.binding;
        if (c45696sus7 == null) {
            Intrinsics.gEmmrt("");
            c45696sus7 = null;
        }
        c45696sus7.UeEOUB.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                LcaDebugSettingActivity.onCreate$lambda$1(this.f$0, radioGroup3, i);
            }
        });
        C45696sus c45696sus8 = this.binding;
        if (c45696sus8 == null) {
            Intrinsics.gEmmrt("");
            c45696sus8 = null;
        }
        c45696sus8.QUSxYX.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i) {
                LcaDebugSettingActivity.onCreate$lambda$2(this.f$0, radioGroup3, i);
            }
        });
        C45696sus c45696sus9 = this.binding;
        if (c45696sus9 == null) {
            Intrinsics.gEmmrt("");
            c45696sus9 = null;
        }
        RadioGroup radioGroup3 = c45696sus9.QUSxYX;
        C45696sus c45696sus10 = this.binding;
        if (c45696sus10 == null) {
            Intrinsics.gEmmrt("");
            c45696sus10 = null;
        }
        radioGroup3.check(c45696sus10.DbNXlk.getId());
        C45696sus c45696sus11 = this.binding;
        if (c45696sus11 == null) {
            Intrinsics.gEmmrt("");
            c45696sus11 = null;
        }
        c45696sus11.RcXXUw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup4, int i) {
                LcaDebugSettingActivity.onCreate$lambda$3(this.f$0, radioGroup4, i);
            }
        });
        C45696sus c45696sus12 = this.binding;
        if (c45696sus12 == null) {
            Intrinsics.gEmmrt("");
            c45696sus12 = null;
        }
        RadioGroup radioGroup4 = c45696sus12.RcXXUw;
        C45696sus c45696sus13 = this.binding;
        if (c45696sus13 == null) {
            Intrinsics.gEmmrt("");
            c45696sus13 = null;
        }
        radioGroup4.check(c45696sus13.AxsJAY.getId());
        C45696sus c45696sus14 = this.binding;
        if (c45696sus14 == null) {
            Intrinsics.gEmmrt("");
            c45696sus14 = null;
        }
        c45696sus14.dNCPSb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup5, int i) {
                LcaDebugSettingActivity.onCreate$lambda$4(this.f$0, radioGroup5, i);
            }
        });
        C45696sus c45696sus15 = this.binding;
        if (c45696sus15 == null) {
            Intrinsics.gEmmrt("");
            c45696sus15 = null;
        }
        RadioGroup radioGroup5 = c45696sus15.dNCPSb;
        C45696sus c45696sus16 = this.binding;
        if (c45696sus16 == null) {
            Intrinsics.gEmmrt("");
            c45696sus16 = null;
        }
        radioGroup5.check(c45696sus16.wlaJM.getId());
        C45696sus c45696sus17 = this.binding;
        if (c45696sus17 == null) {
            Intrinsics.gEmmrt("");
            c45696sus17 = null;
        }
        c45696sus17.djSkpj.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup6, int i) {
                LcaDebugSettingActivity.onCreate$lambda$5(this.f$0, radioGroup6, i);
            }
        });
        C45696sus c45696sus18 = this.binding;
        if (c45696sus18 == null) {
            Intrinsics.gEmmrt("");
            c45696sus18 = null;
        }
        RadioGroup radioGroup6 = c45696sus18.djSkpj;
        C45696sus c45696sus19 = this.binding;
        if (c45696sus19 == null) {
            Intrinsics.gEmmrt("");
            c45696sus19 = null;
        }
        radioGroup6.check(c45696sus19.QKVWgx.getId());
        C45696sus c45696sus20 = this.binding;
        if (c45696sus20 == null) {
            Intrinsics.gEmmrt("");
            c45696sus20 = null;
        }
        c45696sus20.RJOkX.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup7, int i) {
                LcaDebugSettingActivity.onCreate$lambda$6(this.f$0, radioGroup7, i);
            }
        });
        C45696sus c45696sus21 = this.binding;
        if (c45696sus21 == null) {
            Intrinsics.gEmmrt("");
            c45696sus21 = null;
        }
        RadioGroup radioGroup7 = c45696sus21.RJOkX;
        C45696sus c45696sus22 = this.binding;
        if (c45696sus22 == null) {
            Intrinsics.gEmmrt("");
            c45696sus22 = null;
        }
        radioGroup7.check(c45696sus22.AuCTelauCTel.getId());
        C45696sus c45696sus23 = this.binding;
        if (c45696sus23 == null) {
            Intrinsics.gEmmrt("");
            c45696sus23 = null;
        }
        c45696sus23.QVAiDq.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup8, int i) {
                LcaDebugSettingActivity.onCreate$lambda$7(this.f$0, radioGroup8, i);
            }
        });
        C45696sus c45696sus24 = this.binding;
        if (c45696sus24 == null) {
            Intrinsics.gEmmrt("");
            c45696sus24 = null;
        }
        RadioGroup radioGroup8 = c45696sus24.QVAiDq;
        C45696sus c45696sus25 = this.binding;
        if (c45696sus25 == null) {
            Intrinsics.gEmmrt("");
            c45696sus25 = null;
        }
        radioGroup8.check(c45696sus25.iwGUEr.getId());
        C45696sus c45696sus26 = this.binding;
        if (c45696sus26 == null) {
            Intrinsics.gEmmrt("");
            c45696sus26 = null;
        }
        c45696sus26.aKErDB.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup9, int i) {
                LcaDebugSettingActivity.onCreate$lambda$8(this.f$0, radioGroup9, i);
            }
        });
        C45696sus c45696sus27 = this.binding;
        if (c45696sus27 == null) {
            Intrinsics.gEmmrt("");
            c45696sus27 = null;
        }
        RadioGroup radioGroup9 = c45696sus27.aKErDB;
        C45696sus c45696sus28 = this.binding;
        if (c45696sus28 == null) {
            Intrinsics.gEmmrt("");
            c45696sus28 = null;
        }
        radioGroup9.check(c45696sus28.QOLQEE.getId());
        C45696sus c45696sus29 = this.binding;
        if (c45696sus29 == null) {
            Intrinsics.gEmmrt("");
            c45696sus29 = null;
        }
        OKEditText oKEditText = c45696sus29.valueOf;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.addTextChangedListener(new TextWatcher() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$onCreate$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string;
                LcaDebugSettingHelper lcaDebugSettingHelper = LcaDebugSettingHelper.INSTANCE;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                lcaDebugSettingHelper.setSubdomainSiteValue(string);
            }
        });
        List<String> supportedVideoCodecs = LcaMediaUtils.INSTANCE.getSupportedVideoCodecs();
        pUU.valueOf(getTAG(), "supportedVideoCodecs: " + supportedVideoCodecs);
        LcaRgbColorConfig[] colorPool = LcaDebugSettingHelper.INSTANCE.getColorPool();
        int length = colorPool.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LcaRgbColorConfig lcaRgbColorConfig = colorPool[i];
            if (i2 == 0) {
                C45696sus c45696sus30 = this.binding;
                if (c45696sus30 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus30 = null;
                }
                c45696sus30.dxcTrN.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus31 = this.binding;
                if (c45696sus31 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus31 = null;
                }
                c45696sus31.dxcTrN.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus32 = this.binding;
                if (c45696sus32 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus32 = null;
                }
                c45696sus32.ejfBZ.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus33 = this.binding;
                if (c45696sus33 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus33 = null;
                }
                c45696sus33.ejfBZ.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus34 = this.binding;
                if (c45696sus34 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus34 = null;
                }
                c45696sus34.getFieldNames.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus35 = this.binding;
                if (c45696sus35 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus35 = null;
                }
                c45696sus35.getFieldNames.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            } else if (i2 == 1) {
                C45696sus c45696sus36 = this.binding;
                if (c45696sus36 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus36 = null;
                }
                c45696sus36.fFgQHt.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus37 = this.binding;
                if (c45696sus37 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus37 = null;
                }
                c45696sus37.fFgQHt.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus38 = this.binding;
                if (c45696sus38 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus38 = null;
                }
                c45696sus38.fJNWhG.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus39 = this.binding;
                if (c45696sus39 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus39 = null;
                }
                c45696sus39.fJNWhG.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            } else if (i2 == 2) {
                C45696sus c45696sus40 = this.binding;
                if (c45696sus40 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus40 = null;
                }
                c45696sus40.finit.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus41 = this.binding;
                if (c45696sus41 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus41 = null;
                }
                c45696sus41.finit.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus42 = this.binding;
                if (c45696sus42 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus42 = null;
                }
                c45696sus42.fARcdN.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus43 = this.binding;
                if (c45696sus43 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus43 = null;
                }
                c45696sus43.fARcdN.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            } else if (i2 == 3) {
                C45696sus c45696sus44 = this.binding;
                if (c45696sus44 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus44 = null;
                }
                c45696sus44.gGvvIC.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus45 = this.binding;
                if (c45696sus45 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus45 = null;
                }
                c45696sus45.gGvvIC.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus46 = this.binding;
                if (c45696sus46 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus46 = null;
                }
                c45696sus46.AuCTel.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus47 = this.binding;
                if (c45696sus47 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus47 = null;
                }
                c45696sus47.AuCTel.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            } else if (i2 == 4) {
                C45696sus c45696sus48 = this.binding;
                if (c45696sus48 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus48 = null;
                }
                c45696sus48.giSNqX.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus49 = this.binding;
                if (c45696sus49 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus49 = null;
                }
                c45696sus49.giSNqX.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus50 = this.binding;
                if (c45696sus50 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus50 = null;
                }
                c45696sus50.fIwbmz.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus51 = this.binding;
                if (c45696sus51 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus51 = null;
                }
                c45696sus51.fIwbmz.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            } else if (i2 == 5) {
                C45696sus c45696sus52 = this.binding;
                if (c45696sus52 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus52 = null;
                }
                c45696sus52.gasjUx.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus53 = this.binding;
                if (c45696sus53 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus53 = null;
                }
                c45696sus53.gasjUx.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
                C45696sus c45696sus54 = this.binding;
                if (c45696sus54 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus54 = null;
                }
                c45696sus54.hDKMBd.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
                C45696sus c45696sus55 = this.binding;
                if (c45696sus55 == null) {
                    Intrinsics.gEmmrt("");
                    c45696sus55 = null;
                }
                c45696sus55.hDKMBd.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            }
            i++;
            i2++;
        }
        C45696sus c45696sus56 = this.binding;
        if (c45696sus56 == null) {
            Intrinsics.gEmmrt("");
            c45696sus56 = null;
        }
        c45696sus56.dxcTrN.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda19
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$11(this.f$0, view);
            }
        });
        C45696sus c45696sus57 = this.binding;
        if (c45696sus57 == null) {
            Intrinsics.gEmmrt("");
            c45696sus57 = null;
        }
        c45696sus57.fFgQHt.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$12(this.f$0, view);
            }
        });
        C45696sus c45696sus58 = this.binding;
        if (c45696sus58 == null) {
            Intrinsics.gEmmrt("");
            c45696sus58 = null;
        }
        c45696sus58.finit.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$13(this.f$0, view);
            }
        });
        C45696sus c45696sus59 = this.binding;
        if (c45696sus59 == null) {
            Intrinsics.gEmmrt("");
            c45696sus59 = null;
        }
        c45696sus59.gGvvIC.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$14(this.f$0, view);
            }
        });
        C45696sus c45696sus60 = this.binding;
        if (c45696sus60 == null) {
            Intrinsics.gEmmrt("");
            c45696sus60 = null;
        }
        c45696sus60.giSNqX.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$15(this.f$0, view);
            }
        });
        C45696sus c45696sus61 = this.binding;
        if (c45696sus61 == null) {
            Intrinsics.gEmmrt("");
            c45696sus61 = null;
        }
        c45696sus61.gasjUx.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$16(this.f$0, view);
            }
        });
        C45696sus c45696sus62 = this.binding;
        if (c45696sus62 == null) {
            Intrinsics.gEmmrt("");
            c45696sus62 = null;
        }
        c45696sus62.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$27(this.f$0, view);
            }
        });
        C45696sus c45696sus63 = this.binding;
        if (c45696sus63 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus = c45696sus63;
        }
        c45696sus.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaDebugSettingActivity.onCreate$lambda$28(this.f$0, view);
            }
        });
    }

    public static final void onCreate$lambda$0(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.zuBGHE.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbFullVideo");
            LcaDebugSettingHelper lcaDebugSettingHelper = LcaDebugSettingHelper.INSTANCE;
            lcaDebugSettingHelper.setVideoOutputWay(lcaDebugSettingHelper.getVIDEO_OUTPUT_FULL());
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.OcIXYQ.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbSegmentVideo");
            LcaDebugSettingHelper lcaDebugSettingHelper2 = LcaDebugSettingHelper.INSTANCE;
            lcaDebugSettingHelper2.setVideoOutputWay(lcaDebugSettingHelper2.getVIDEO_OUTPUT_SEGMENT());
        }
    }

    public static final void onCreate$lambda$1(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.AubY.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbEnableQc");
            LcaDebugSettingHelper.INSTANCE.setEnableQC(true);
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.zsXlph.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbDisableQc");
            LcaDebugSettingHelper.INSTANCE.setEnableQC(false);
        }
    }

    public static final void onCreate$lambda$2(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.AkhnZx.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbApiCollection");
            LcaDebugSettingHelper.INSTANCE.setApiMode(LcaSdkConfiguration.Companion.getAPI_DATA_COLLECTION());
            C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
            if (c45696sus3 == null) {
                Intrinsics.gEmmrt("");
                c45696sus3 = null;
            }
            c45696sus3.zuBGHE.setEnabled(true);
            C45696sus c45696sus4 = lcaDebugSettingActivity.binding;
            if (c45696sus4 == null) {
                Intrinsics.gEmmrt("");
                c45696sus4 = null;
            }
            c45696sus4.AxsJAY.setEnabled(false);
            C45696sus c45696sus5 = lcaDebugSettingActivity.binding;
            if (c45696sus5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus5;
            }
            c45696sus2.sSMYrx.setEnabled(false);
            return;
        }
        C45696sus c45696sus6 = lcaDebugSettingActivity.binding;
        if (c45696sus6 == null) {
            Intrinsics.gEmmrt("");
            c45696sus6 = null;
        }
        if (i == c45696sus6.values.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbApiModel");
            LcaDebugSettingHelper.INSTANCE.setApiMode(LcaSdkConfiguration.Companion.getAPI_MODEL_PREDICTION());
            C45696sus c45696sus7 = lcaDebugSettingActivity.binding;
            if (c45696sus7 == null) {
                Intrinsics.gEmmrt("");
                c45696sus7 = null;
            }
            c45696sus7.zuBGHE.setEnabled(true);
            C45696sus c45696sus8 = lcaDebugSettingActivity.binding;
            if (c45696sus8 == null) {
                Intrinsics.gEmmrt("");
                c45696sus8 = null;
            }
            c45696sus8.AxsJAY.setEnabled(false);
            C45696sus c45696sus9 = lcaDebugSettingActivity.binding;
            if (c45696sus9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus9;
            }
            c45696sus2.sSMYrx.setEnabled(false);
            return;
        }
        C45696sus c45696sus10 = lcaDebugSettingActivity.binding;
        if (c45696sus10 == null) {
            Intrinsics.gEmmrt("");
            c45696sus10 = null;
        }
        if (i == c45696sus10.DbNXlk.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbApiJwst");
            LcaDebugSettingHelper.INSTANCE.setApiMode(LcaSdkConfiguration.Companion.getAPI_MODE_JWST());
            C45696sus c45696sus11 = lcaDebugSettingActivity.binding;
            if (c45696sus11 == null) {
                Intrinsics.gEmmrt("");
                c45696sus11 = null;
            }
            c45696sus11.OcIXYQ.setChecked(true);
            C45696sus c45696sus12 = lcaDebugSettingActivity.binding;
            if (c45696sus12 == null) {
                Intrinsics.gEmmrt("");
                c45696sus12 = null;
            }
            c45696sus12.zuBGHE.setEnabled(false);
            C45696sus c45696sus13 = lcaDebugSettingActivity.binding;
            if (c45696sus13 == null) {
                Intrinsics.gEmmrt("");
                c45696sus13 = null;
            }
            c45696sus13.AxsJAY.setEnabled(true);
            C45696sus c45696sus14 = lcaDebugSettingActivity.binding;
            if (c45696sus14 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus14;
            }
            c45696sus2.sSMYrx.setEnabled(true);
        }
    }

    public static final void onCreate$lambda$3(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.AxsJAY.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbJwstEnvSwimlane");
            LcaDebugSettingHelper.INSTANCE.setJwstEnv(LcaSdkConfiguration.Companion.getENV_SWIMLANE());
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.sSMYrx.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbJwstEnvOkx");
            LcaDebugSettingHelper.INSTANCE.setJwstEnv(LcaSdkConfiguration.Companion.getENV_OKX());
        }
    }

    public static final void onCreate$lambda$4(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.gHZMYf.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbFaceOvalGuideAnimationDefault");
            LcaDebugSettingHelper.INSTANCE.setFaceOvalGuideAnimation(LcaSdkConfiguration.Companion.getFACE_OVAL_ANIMATION_DEFAULT());
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
            c45696sus3 = null;
        }
        if (i == c45696sus3.zLjUOn.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbFaceOvalGuideAnimationA");
            LcaDebugSettingHelper.INSTANCE.setFaceOvalGuideAnimation(LcaSdkConfiguration.Companion.getFACE_OVAL_ANIMATION_A());
            return;
        }
        C45696sus c45696sus4 = lcaDebugSettingActivity.binding;
        if (c45696sus4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus4;
        }
        if (i == c45696sus2.wlaJM.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbFaceOvalGuideAnimationB");
            LcaDebugSettingHelper.INSTANCE.setFaceOvalGuideAnimation(LcaSdkConfiguration.Companion.getFACE_OVAL_ANIMATION_B());
        }
    }

    public static final void onCreate$lambda$5(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.QKVWgx.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbMoveCloseTipShow");
            LcaDebugSettingHelper.INSTANCE.setMoveCloseShowOrNot(true);
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.AwvSrB.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbMoveCloseTipHide");
            LcaDebugSettingHelper.INSTANCE.setMoveCloseShowOrNot(false);
        }
    }

    public static final void onCreate$lambda$6(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.getNewProxyInstance.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbDataSignNo");
            LcaDebugSettingHelper.INSTANCE.setDataSign(false);
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.AuCTelauCTel.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbDataSignYes");
            LcaDebugSettingHelper.INSTANCE.setDataSign(true);
        }
    }

    public static final void onCreate$lambda$7(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.uzCIH.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbDataObfuscationNo");
            LcaDebugSettingHelper.INSTANCE.setDataObfuscation(false);
            return;
        }
        C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45696sus2 = c45696sus3;
        }
        if (i == c45696sus2.iwGUEr.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbDataObfuscationYes");
            LcaDebugSettingHelper.INSTANCE.setDataObfuscation(true);
        }
    }

    public static final void onCreate$lambda$8(LcaDebugSettingActivity lcaDebugSettingActivity, RadioGroup radioGroup, int i) {
        C45696sus c45696sus = lcaDebugSettingActivity.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        if (i == c45696sus.QOLQEE.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbSubdomainNone");
            LcaDebugSettingHelper.INSTANCE.setSubdomainStrategyType(0);
            C45696sus c45696sus3 = lcaDebugSettingActivity.binding;
            if (c45696sus3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus3;
            }
            c45696sus2.isConnected.setVisibility(8);
            return;
        }
        C45696sus c45696sus4 = lcaDebugSettingActivity.binding;
        if (c45696sus4 == null) {
            Intrinsics.gEmmrt("");
            c45696sus4 = null;
        }
        if (i == c45696sus4.ORxRYg.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbSubdomainAuto");
            LcaDebugSettingHelper.INSTANCE.setSubdomainStrategyType(1);
            C45696sus c45696sus5 = lcaDebugSettingActivity.binding;
            if (c45696sus5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus5;
            }
            c45696sus2.isConnected.setVisibility(8);
            return;
        }
        C45696sus c45696sus6 = lcaDebugSettingActivity.binding;
        if (c45696sus6 == null) {
            Intrinsics.gEmmrt("");
            c45696sus6 = null;
        }
        if (i == c45696sus6.DTwDnp.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbSubdomainGlobal");
            LcaDebugSettingHelper.INSTANCE.setSubdomainStrategyType(2);
            C45696sus c45696sus7 = lcaDebugSettingActivity.binding;
            if (c45696sus7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus7;
            }
            c45696sus2.isConnected.setVisibility(8);
            return;
        }
        C45696sus c45696sus8 = lcaDebugSettingActivity.binding;
        if (c45696sus8 == null) {
            Intrinsics.gEmmrt("");
            c45696sus8 = null;
        }
        if (i == c45696sus8.QfsBiF.getId()) {
            pUU.valueOf(lcaDebugSettingActivity.getTAG(), "rbSubdomainSubdomain");
            LcaDebugSettingHelper.INSTANCE.setSubdomainStrategyType(3);
            C45696sus c45696sus9 = lcaDebugSettingActivity.binding;
            if (c45696sus9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus9;
            }
            c45696sus2.isConnected.setVisibility(0);
        }
    }

    public static final void onCreate$lambda$11(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[0]);
    }

    public static final void onCreate$lambda$12(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[1]);
    }

    public static final void onCreate$lambda$13(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[2]);
    }

    public static final void onCreate$lambda$14(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[3]);
    }

    public static final void onCreate$lambda$15(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[4]);
    }

    public static final void onCreate$lambda$16(LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.selectColor(LcaDebugSettingHelper.INSTANCE.getColorPool()[5]);
    }

    public static final void onCreate$lambda$27(final LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        lcaDebugSettingActivity.prepareSetting();
        LcaSdkCollaborator companion = LcaSdkCollaborator.Companion.getInstance();
        LcaDebugSettingHelper lcaDebugSettingHelper = LcaDebugSettingHelper.INSTANCE;
        LcaSdkLivenessConfig lcaSdkLivenessConfig = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        LcaSdkConfiguration lcaSdkConfiguration = new LcaSdkConfiguration(lcaDebugSettingHelper.getApiMode(), lcaSdkLivenessConfig, str, str2, str3, str4, lcaDebugSettingHelper.getEnableQC(), Intrinsics.EZpvd((Object) lcaDebugSettingHelper.getVideoOutputWay(), (Object) lcaDebugSettingHelper.getVIDEO_OUTPUT_SEGMENT()), lcaDebugSettingHelper.requestDebugChallengeData(), null, false, lcaDebugSettingHelper.getDataSign(), lcaDebugSettingHelper.getDataObfuscation(), lcaDebugSettingHelper.getFaceOvalGuideAnimation(), lcaDebugSettingHelper.getMoveCloseShowOrNot(), lcaDebugSettingHelper.getExtParams(), 574, null);
        String jwstHttpBaseUrl = lcaDebugSettingHelper.getJwstHttpBaseUrl();
        if (jwstHttpBaseUrl != null) {
            lcaSdkConfiguration.setJwstHttpBaseUrl(jwstHttpBaseUrl);
        }
        String jwstWsBaseUrl = lcaDebugSettingHelper.getJwstWsBaseUrl();
        if (jwstWsBaseUrl != null) {
            lcaSdkConfiguration.setJwstWsBaseUrl(jwstWsBaseUrl);
        }
        Unit unit = Unit.INSTANCE;
        companion.startLivenessCheck$OKCompliance_ok_compliance_dynamic_lca_impl(lcaDebugSettingActivity, lcaSdkConfiguration, new Function2() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LcaDebugSettingActivity.onCreate$lambda$27$lambda$20(this.f$0, (LcaLivenessCheckResult) obj, (Function0) obj2);
            }
        }, new Function2() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LcaDebugSettingActivity.onCreate$lambda$27$lambda$21(this.f$0, (byte[]) obj, ((Long) obj2).longValue());
            }
        }, new Function1() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaDebugSettingActivity.onCreate$lambda$27$lambda$26((LcaDebugInfo) obj);
            }
        });
    }

    public static final Unit onCreate$lambda$27$lambda$20(LcaDebugSettingActivity lcaDebugSettingActivity, LcaLivenessCheckResult lcaLivenessCheckResult, Function0 function0) {
        Intrinsics.checkNotNullParameter(lcaLivenessCheckResult, "");
        if (lcaLivenessCheckResult instanceof LcaLivenessCheckSuccess) {
            LcaDebugDataManager lcaDebugDataManager = LcaDebugDataManager.INSTANCE;
            lcaDebugDataManager.setError(null);
            lcaDebugDataManager.setResponse(((LcaLivenessCheckSuccess) lcaLivenessCheckResult).getResponse());
            lcaDebugSettingActivity.startActivity(new Intent(lcaDebugSettingActivity, (Class<?>) LcaDebugResultActivity.class));
            if (function0 != null) {
                function0.invoke();
            }
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnCancel) {
            LcaDebugDataManager lcaDebugDataManager2 = LcaDebugDataManager.INSTANCE;
            lcaDebugDataManager2.setResponse(null);
            lcaDebugDataManager2.setError(null);
            C55328xhq.show$default(C55328xhq.OLrzqt, "Liveness Cancelled", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
        } else if (!(lcaLivenessCheckResult instanceof LcaLivenessCheckOnRestartDialogClicked) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnRetryDialogPop) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnCloseSelfieView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnFirstFreshnessView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnFarSelfieView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnFinalCheckView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnStartingUpView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnReloadScreenClicked) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnReloadScreenView) && !(lcaLivenessCheckResult instanceof LcaLivenessCheckOnSocketConnected)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$27$lambda$21(LcaDebugSettingActivity lcaDebugSettingActivity, byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        LcaDebugChunkFileManager.INSTANCE.saveChunkToFile(lcaDebugSettingActivity, bArr, j);
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$27$lambda$26(LcaDebugInfo lcaDebugInfo) {
        String qcScoreResultJson;
        File videoTempFile;
        String responseRawJson;
        String requestRawJson;
        if (lcaDebugInfo != null && (requestRawJson = lcaDebugInfo.getRequestRawJson()) != null) {
            LcaDebugDataManager.INSTANCE.setRequestRawJson(requestRawJson);
        }
        if (lcaDebugInfo != null && (responseRawJson = lcaDebugInfo.getResponseRawJson()) != null) {
            LcaDebugDataManager.INSTANCE.setResponseRawJson(responseRawJson);
        }
        if (lcaDebugInfo != null && (videoTempFile = lcaDebugInfo.getVideoTempFile()) != null) {
            LcaDebugDataManager.INSTANCE.setVideoTempFile(videoTempFile);
        }
        if (lcaDebugInfo != null && (qcScoreResultJson = lcaDebugInfo.getQcScoreResultJson()) != null) {
            LcaDebugDataManager.INSTANCE.setQcScoreResultJson(qcScoreResultJson);
        }
        return Unit.INSTANCE;
    }

    public static final void onCreate$lambda$28(final LcaDebugSettingActivity lcaDebugSettingActivity, View view) {
        pUU.KWHzl(lcaDebugSettingActivity.getTAG(), "btnTriggerFaceGuard clicked");
        lcaDebugSettingActivity.showLoading();
        InterfaceC46982thT.TaskDescription.profile$default(C46979thQ.copydefault.OLrzqt(), OKRiskLibrarySource.KYC_LIVENESS, new InterfaceC47027tiL() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugSettingActivity$onCreate$19$1
            @Override // o.InterfaceC47027tiL
            public void onDeviceTokenReturned(C47029tiN c47029tiN) {
                Intrinsics.checkNotNullParameter(c47029tiN, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), Dispatchers.getMain(), null, new LcaDebugSettingActivity$onCreate$19$1$onDeviceTokenReturned$1(this.this$0, c47029tiN, null), 2, null);
            }
        }, null, null, 12, null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
    }

    public final void prepareSetting() {
        LcaDebugChunkFileManager.INSTANCE.clearChunks(this);
    }

    public final void selectColor(LcaRgbColorConfig lcaRgbColorConfig) {
        C45696sus c45696sus = this.binding;
        C45696sus c45696sus2 = null;
        if (c45696sus == null) {
            Intrinsics.gEmmrt("");
            c45696sus = null;
        }
        int checkedRadioButtonId = c45696sus.QbewEr.getCheckedRadioButtonId();
        C45696sus c45696sus3 = this.binding;
        if (c45696sus3 == null) {
            Intrinsics.gEmmrt("");
            c45696sus3 = null;
        }
        if (checkedRadioButtonId == c45696sus3.ejfBZ.getId()) {
            C45696sus c45696sus4 = this.binding;
            if (c45696sus4 == null) {
                Intrinsics.gEmmrt("");
                c45696sus4 = null;
            }
            c45696sus4.ejfBZ.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus5 = this.binding;
            if (c45696sus5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus5;
            }
            c45696sus2.ejfBZ.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[0] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus6 = this.binding;
        if (c45696sus6 == null) {
            Intrinsics.gEmmrt("");
            c45696sus6 = null;
        }
        if (checkedRadioButtonId == c45696sus6.fJNWhG.getId()) {
            C45696sus c45696sus7 = this.binding;
            if (c45696sus7 == null) {
                Intrinsics.gEmmrt("");
                c45696sus7 = null;
            }
            c45696sus7.fJNWhG.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus8 = this.binding;
            if (c45696sus8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus8;
            }
            c45696sus2.fJNWhG.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[1] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus9 = this.binding;
        if (c45696sus9 == null) {
            Intrinsics.gEmmrt("");
            c45696sus9 = null;
        }
        if (checkedRadioButtonId == c45696sus9.fARcdN.getId()) {
            C45696sus c45696sus10 = this.binding;
            if (c45696sus10 == null) {
                Intrinsics.gEmmrt("");
                c45696sus10 = null;
            }
            c45696sus10.fARcdN.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus11 = this.binding;
            if (c45696sus11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus11;
            }
            c45696sus2.fARcdN.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[2] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus12 = this.binding;
        if (c45696sus12 == null) {
            Intrinsics.gEmmrt("");
            c45696sus12 = null;
        }
        if (checkedRadioButtonId == c45696sus12.AuCTel.getId()) {
            C45696sus c45696sus13 = this.binding;
            if (c45696sus13 == null) {
                Intrinsics.gEmmrt("");
                c45696sus13 = null;
            }
            c45696sus13.AuCTel.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus14 = this.binding;
            if (c45696sus14 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus14;
            }
            c45696sus2.AuCTel.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[3] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus15 = this.binding;
        if (c45696sus15 == null) {
            Intrinsics.gEmmrt("");
            c45696sus15 = null;
        }
        if (checkedRadioButtonId == c45696sus15.fIwbmz.getId()) {
            C45696sus c45696sus16 = this.binding;
            if (c45696sus16 == null) {
                Intrinsics.gEmmrt("");
                c45696sus16 = null;
            }
            c45696sus16.fIwbmz.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus17 = this.binding;
            if (c45696sus17 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus17;
            }
            c45696sus2.fIwbmz.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[4] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus18 = this.binding;
        if (c45696sus18 == null) {
            Intrinsics.gEmmrt("");
            c45696sus18 = null;
        }
        if (checkedRadioButtonId == c45696sus18.hDKMBd.getId()) {
            C45696sus c45696sus19 = this.binding;
            if (c45696sus19 == null) {
                Intrinsics.gEmmrt("");
                c45696sus19 = null;
            }
            c45696sus19.hDKMBd.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus20 = this.binding;
            if (c45696sus20 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus20;
            }
            c45696sus2.hDKMBd.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[5] = lcaRgbColorConfig;
            return;
        }
        C45696sus c45696sus21 = this.binding;
        if (c45696sus21 == null) {
            Intrinsics.gEmmrt("");
            c45696sus21 = null;
        }
        if (checkedRadioButtonId == c45696sus21.getFieldNames.getId()) {
            C45696sus c45696sus22 = this.binding;
            if (c45696sus22 == null) {
                Intrinsics.gEmmrt("");
                c45696sus22 = null;
            }
            c45696sus22.getFieldNames.setText("(" + lcaRgbColorConfig.getRed() + ", " + lcaRgbColorConfig.getGreen() + ", " + lcaRgbColorConfig.getBlue() + ")");
            C45696sus c45696sus23 = this.binding;
            if (c45696sus23 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45696sus2 = c45696sus23;
            }
            c45696sus2.getFieldNames.setBackgroundColor(Color.rgb(lcaRgbColorConfig.getRed(), lcaRgbColorConfig.getGreen(), lcaRgbColorConfig.getBlue()));
            LcaDebugSettingHelper.INSTANCE.getColorSequence()[6] = lcaRgbColorConfig;
        }
    }

    public final void copyToClipboard(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Object systemService = getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, str2));
        C55328xhq.show$default(C55328xhq.OLrzqt, (CharSequence) "拷贝成功", (Drawable) null, 0, (Integer) 80, 0, 0, 54, (Object) null).show();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
