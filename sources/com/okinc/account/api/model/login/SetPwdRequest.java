package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SetPwdRequest {
    private String action;
    private UnbindSocialAccount actionPayload;
    private String newPwd;
    private String newPwdHash;
    private String reNewPwd;
    private Integer type;
    private Boolean unifiedCheckCode;
    private String validateCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetPwdRequest() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (UnbindSocialAccount) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnbindSocialAccount getActionPayload() {
        return this.actionPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPwd() {
        return this.newPwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewPwdHash() {
        return this.newPwdHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReNewPwd() {
        return this.reNewPwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUnifiedCheckCode() {
        return this.unifiedCheckCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidateCode() {
        return this.validateCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionPayload(UnbindSocialAccount unbindSocialAccount) {
        this.actionPayload = unbindSocialAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPwd(String str) {
        this.newPwd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewPwdHash(String str) {
        this.newPwdHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReNewPwd(String str) {
        this.reNewPwd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnifiedCheckCode(Boolean bool) {
        this.unifiedCheckCode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidateCode(String str) {
        this.validateCode = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.SetPwdRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetPwdRequest> serializer() {
            return SetPwdRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetPwdRequest(int i, String str, String str2, String str3, Integer num, String str4, String str5, UnbindSocialAccount unbindSocialAccount, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.newPwd = null;
        } else {
            this.newPwd = str;
        }
        if ((i & 2) == 0) {
            this.newPwdHash = null;
        } else {
            this.newPwdHash = str2;
        }
        if ((i & 4) == 0) {
            this.reNewPwd = null;
        } else {
            this.reNewPwd = str3;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 16) == 0) {
            this.validateCode = null;
        } else {
            this.validateCode = str4;
        }
        if ((i & 32) == 0) {
            this.action = null;
        } else {
            this.action = str5;
        }
        if ((i & 64) == 0) {
            this.actionPayload = null;
        } else {
            this.actionPayload = unbindSocialAccount;
        }
        if ((i & 128) == 0) {
            this.unifiedCheckCode = null;
        } else {
            this.unifiedCheckCode = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(SetPwdRequest setPwdRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || setPwdRequest.newPwd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, setPwdRequest.newPwd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || setPwdRequest.newPwdHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, setPwdRequest.newPwdHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || setPwdRequest.reNewPwd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, setPwdRequest.reNewPwd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || setPwdRequest.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, setPwdRequest.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || setPwdRequest.validateCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, setPwdRequest.validateCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || setPwdRequest.action != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, setPwdRequest.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || setPwdRequest.actionPayload != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, UnbindSocialAccount$$serializer.INSTANCE, setPwdRequest.actionPayload);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && setPwdRequest.unifiedCheckCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, setPwdRequest.unifiedCheckCode);
    }

    public SetPwdRequest(String str, String str2, String str3, Integer num, String str4, String str5, UnbindSocialAccount unbindSocialAccount, Boolean bool) {
        this.newPwd = str;
        this.newPwdHash = str2;
        this.reNewPwd = str3;
        this.type = num;
        this.validateCode = str4;
        this.action = str5;
        this.actionPayload = unbindSocialAccount;
        this.unifiedCheckCode = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.account.api.model.login.UnbindSocialAccount:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.login.UnbindSocialAccount) : (r16v0 com.okinc.account.api.model.login.UnbindSocialAccount))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.account.api.model.login.UnbindSocialAccount, java.lang.Boolean):void (m)] (LINE:13) call: com.okinc.account.api.model.login.SetPwdRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.account.api.model.login.UnbindSocialAccount, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SetPwdRequest(String str, String str2, String str3, Integer num, String str4, String str5, UnbindSocialAccount unbindSocialAccount, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : unbindSocialAccount, (i & 128) == 0 ? bool : null);
    }
}
