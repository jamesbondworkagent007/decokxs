package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.InHouseIMGroupCampaign;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.sJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44273sJs implements InHouseIMGroupInfoDao {
    public final RoomDatabase EZpvd;
    public final C44237sIj copydefault = new C44237sIj();
    public final C44241sIn AEQbTJ = new C44241sIn();
    public final EntityInsertAdapter<InHouseIMGroupEntity> OLrzqt = new EntityInsertAdapter<InHouseIMGroupEntity>() { // from class: o.sJs.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `in_house_im_group` (`group_id`,`group_master_id`,`group_name`,`biz_group_name`,`group_avatar`,`group_notice`,`noticeEditTime`,`group_desc`,`is_store`,`is_verify`,`is_asset`,`is_pay`,`asset_currency_id`,`asset_currency_symbol`,`asset_amount`,`pay_currency_id`,`pay_currency_symbol`,`pay_amount`,`status`,`timestamp`,`create_time`,`update_time`,`group_count`,`v1`,`v2`,`v3`,`allowMentionOthers`,`isCanTransferOwnership`,`type`,`userGroupPermission`,`groupVoiceCallConfig`,`allowMembersToAddMembers`,`allowSharingInvitationQrCode`,`requireAdminApprovalToJoin`,`pendingJoinRequests`,`maxMemberCount`,`public_group_type`,`paidGroupInfo_outstandingAmount`,`paidGroupInfo_billingModel_enabled`,`paidGroupInfo_billingModel_currencyId`,`paidGroupInfo_billingModel_currencyCode`,`paidGroupInfo_billingModel_currencySign`,`paidGroupInfo_billingModel_amount`,`paidGroupInfo_billingModel_billingType`,`paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus`,`paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime`,`paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime`,`paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus`,`paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus`,`campaign_activityId`,`campaign_urlSlug`,`campaign_urlSubPath`,`campaign_campaignStartTime`,`campaign_campaignEndTime`,`campaign_registrationStartTime`,`campaign_minAppVersion`,`superGroupConfig_showSuperGroupUpgradeStatus`,`superGroupConfig_orbiterPlusExpiryTimestamp`,`superGroupConfig_capacity`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMGroupEntity inHouseIMGroupEntity) {
            if (inHouseIMGroupEntity.getGroupId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMGroupEntity.getGroupId());
            }
            if (inHouseIMGroupEntity.getMasterId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMGroupEntity.getMasterId());
            }
            if (inHouseIMGroupEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, inHouseIMGroupEntity.getName());
            }
            if (inHouseIMGroupEntity.getBizGroupName() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, inHouseIMGroupEntity.getBizGroupName());
            }
            if (inHouseIMGroupEntity.getAvatar() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, inHouseIMGroupEntity.getAvatar());
            }
            if (inHouseIMGroupEntity.getNotice() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, inHouseIMGroupEntity.getNotice());
            }
            sQLiteStatement.mo5793bindLong(7, inHouseIMGroupEntity.getNoticeEditTime());
            if (inHouseIMGroupEntity.getDescription() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, inHouseIMGroupEntity.getDescription());
            }
            sQLiteStatement.mo5793bindLong(9, inHouseIMGroupEntity.getStoreStatus());
            sQLiteStatement.mo5793bindLong(10, inHouseIMGroupEntity.getNeedVerifyStatus());
            sQLiteStatement.mo5793bindLong(11, inHouseIMGroupEntity.getAssetStatus());
            sQLiteStatement.mo5793bindLong(12, inHouseIMGroupEntity.getPayStatus());
            if (inHouseIMGroupEntity.getAssetCurrencyId() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5793bindLong(13, inHouseIMGroupEntity.getAssetCurrencyId().intValue());
            }
            if (inHouseIMGroupEntity.getAssetCurrencySymbol() == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, inHouseIMGroupEntity.getAssetCurrencySymbol());
            }
            if (inHouseIMGroupEntity.getAssetAmount() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5792bindDouble(15, inHouseIMGroupEntity.getAssetAmount().doubleValue());
            }
            if (inHouseIMGroupEntity.getPayCurrencyId() == null) {
                sQLiteStatement.mo5794bindNull(16);
            } else {
                sQLiteStatement.mo5793bindLong(16, inHouseIMGroupEntity.getPayCurrencyId().intValue());
            }
            if (inHouseIMGroupEntity.getPayCurrencySymbol() == null) {
                sQLiteStatement.mo5794bindNull(17);
            } else {
                sQLiteStatement.mo5795bindText(17, inHouseIMGroupEntity.getPayCurrencySymbol());
            }
            if (inHouseIMGroupEntity.getPayAmount() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5792bindDouble(18, inHouseIMGroupEntity.getPayAmount().doubleValue());
            }
            sQLiteStatement.mo5793bindLong(19, inHouseIMGroupEntity.getStatus());
            sQLiteStatement.mo5793bindLong(20, inHouseIMGroupEntity.getTimestamp());
            sQLiteStatement.mo5793bindLong(21, inHouseIMGroupEntity.getCreateTime());
            sQLiteStatement.mo5793bindLong(22, inHouseIMGroupEntity.getUpdateTime());
            sQLiteStatement.mo5793bindLong(23, inHouseIMGroupEntity.getGroupCount());
            if (inHouseIMGroupEntity.getV1Field() == null) {
                sQLiteStatement.mo5794bindNull(24);
            } else {
                sQLiteStatement.mo5795bindText(24, inHouseIMGroupEntity.getV1Field());
            }
            if (inHouseIMGroupEntity.getV2Field() == null) {
                sQLiteStatement.mo5794bindNull(25);
            } else {
                sQLiteStatement.mo5795bindText(25, inHouseIMGroupEntity.getV2Field());
            }
            if (inHouseIMGroupEntity.getV3Field() == null) {
                sQLiteStatement.mo5794bindNull(26);
            } else {
                sQLiteStatement.mo5795bindText(26, inHouseIMGroupEntity.getV3Field());
            }
            if (inHouseIMGroupEntity.getAllowMentionOthers() == null) {
                sQLiteStatement.mo5794bindNull(27);
            } else {
                sQLiteStatement.mo5793bindLong(27, inHouseIMGroupEntity.getAllowMentionOthers().intValue());
            }
            if (inHouseIMGroupEntity.getCanTransferOwnership() == null) {
                sQLiteStatement.mo5794bindNull(28);
            } else {
                sQLiteStatement.mo5793bindLong(28, inHouseIMGroupEntity.getCanTransferOwnership().intValue());
            }
            if (inHouseIMGroupEntity.getType() == null) {
                sQLiteStatement.mo5794bindNull(29);
            } else {
                sQLiteStatement.mo5793bindLong(29, inHouseIMGroupEntity.getType().intValue());
            }
            java.lang.String strOLrzqt = C44273sJs.this.copydefault.OLrzqt(inHouseIMGroupEntity.getUserGroupPermission());
            if (strOLrzqt == null) {
                sQLiteStatement.mo5794bindNull(30);
            } else {
                sQLiteStatement.mo5795bindText(30, strOLrzqt);
            }
            java.lang.String strOLrzqt2 = C44273sJs.this.AEQbTJ.OLrzqt(inHouseIMGroupEntity.getGroupVoiceCallConfig());
            if (strOLrzqt2 == null) {
                sQLiteStatement.mo5794bindNull(31);
            } else {
                sQLiteStatement.mo5795bindText(31, strOLrzqt2);
            }
            if (inHouseIMGroupEntity.getAllowMembersToAddMembers() == null) {
                sQLiteStatement.mo5794bindNull(32);
            } else {
                sQLiteStatement.mo5793bindLong(32, inHouseIMGroupEntity.getAllowMembersToAddMembers().intValue());
            }
            if (inHouseIMGroupEntity.getAllowSharingInvitationQrCode() == null) {
                sQLiteStatement.mo5794bindNull(33);
            } else {
                sQLiteStatement.mo5793bindLong(33, inHouseIMGroupEntity.getAllowSharingInvitationQrCode().intValue());
            }
            if (inHouseIMGroupEntity.getRequireAdminApprovalToJoin() == null) {
                sQLiteStatement.mo5794bindNull(34);
            } else {
                sQLiteStatement.mo5793bindLong(34, inHouseIMGroupEntity.getRequireAdminApprovalToJoin().intValue());
            }
            if (inHouseIMGroupEntity.getPendingJoinRequests() == null) {
                sQLiteStatement.mo5794bindNull(35);
            } else {
                sQLiteStatement.mo5793bindLong(35, inHouseIMGroupEntity.getPendingJoinRequests().intValue());
            }
            if (inHouseIMGroupEntity.getMaxMemberCount() == null) {
                sQLiteStatement.mo5794bindNull(36);
            } else {
                sQLiteStatement.mo5793bindLong(36, inHouseIMGroupEntity.getMaxMemberCount().longValue());
            }
            if (inHouseIMGroupEntity.getPublicGroupType() == null) {
                sQLiteStatement.mo5794bindNull(37);
            } else {
                sQLiteStatement.mo5795bindText(37, C44273sJs.this.OLrzqt(inHouseIMGroupEntity.getPublicGroupType()));
            }
            PaidGroupInfo paidGroupInfo = inHouseIMGroupEntity.getPaidGroupInfo();
            if (paidGroupInfo != null) {
                if (paidGroupInfo.getOutstandingAmount() == null) {
                    sQLiteStatement.mo5794bindNull(38);
                } else {
                    sQLiteStatement.mo5795bindText(38, paidGroupInfo.getOutstandingAmount());
                }
                GroupEntryBillingModel billingModel = paidGroupInfo.getBillingModel();
                if (billingModel != null) {
                    if (billingModel.getEnabled() == null) {
                        sQLiteStatement.mo5794bindNull(39);
                    } else {
                        sQLiteStatement.mo5795bindText(39, C44273sJs.this.EZpvd(billingModel.getEnabled()));
                    }
                    if (billingModel.getCurrencyId() == null) {
                        sQLiteStatement.mo5794bindNull(40);
                    } else {
                        sQLiteStatement.mo5793bindLong(40, billingModel.getCurrencyId().intValue());
                    }
                    if (billingModel.getCurrencyCode() == null) {
                        sQLiteStatement.mo5794bindNull(41);
                    } else {
                        sQLiteStatement.mo5795bindText(41, billingModel.getCurrencyCode());
                    }
                    if (billingModel.getCurrencySign() == null) {
                        sQLiteStatement.mo5794bindNull(42);
                    } else {
                        sQLiteStatement.mo5795bindText(42, billingModel.getCurrencySign());
                    }
                    if (billingModel.getAmount() == null) {
                        sQLiteStatement.mo5794bindNull(43);
                    } else {
                        sQLiteStatement.mo5795bindText(43, billingModel.getAmount());
                    }
                    if (billingModel.getBillingType() == null) {
                        sQLiteStatement.mo5794bindNull(44);
                    } else {
                        sQLiteStatement.mo5795bindText(44, C44273sJs.this.EZpvd(billingModel.getBillingType()));
                    }
                } else {
                    sQLiteStatement.mo5794bindNull(39);
                    sQLiteStatement.mo5794bindNull(40);
                    sQLiteStatement.mo5794bindNull(41);
                    sQLiteStatement.mo5794bindNull(42);
                    sQLiteStatement.mo5794bindNull(43);
                    sQLiteStatement.mo5794bindNull(44);
                }
                PaidGroupMemberStatus paidGroupMemberStatus = paidGroupInfo.getPaidGroupMemberStatus();
                if (paidGroupMemberStatus != null) {
                    if (paidGroupMemberStatus.getPaymentRequiredStatus() == null) {
                        sQLiteStatement.mo5794bindNull(45);
                    } else {
                        sQLiteStatement.mo5795bindText(45, C44273sJs.this.OLrzqt(paidGroupMemberStatus.getPaymentRequiredStatus()));
                    }
                    if (paidGroupMemberStatus.getLastPaymentDatetime() == null) {
                        sQLiteStatement.mo5794bindNull(46);
                    } else {
                        sQLiteStatement.mo5793bindLong(46, paidGroupMemberStatus.getLastPaymentDatetime().longValue());
                    }
                    if (paidGroupMemberStatus.getNextPaymentDatetime() == null) {
                        sQLiteStatement.mo5794bindNull(47);
                    } else {
                        sQLiteStatement.mo5793bindLong(47, paidGroupMemberStatus.getNextPaymentDatetime().longValue());
                    }
                    if (paidGroupMemberStatus.getPaidGroupBillingStatus() == null) {
                        sQLiteStatement.mo5794bindNull(48);
                    } else {
                        sQLiteStatement.mo5795bindText(48, C44273sJs.this.EZpvd(paidGroupMemberStatus.getPaidGroupBillingStatus()));
                    }
                    if (paidGroupMemberStatus.getBillingCyclePaymentStatus() == null) {
                        sQLiteStatement.mo5794bindNull(49);
                    } else {
                        sQLiteStatement.mo5795bindText(49, C44273sJs.this.KWHzl(paidGroupMemberStatus.getBillingCyclePaymentStatus()));
                    }
                } else {
                    sQLiteStatement.mo5794bindNull(45);
                    sQLiteStatement.mo5794bindNull(46);
                    sQLiteStatement.mo5794bindNull(47);
                    sQLiteStatement.mo5794bindNull(48);
                    sQLiteStatement.mo5794bindNull(49);
                }
            } else {
                sQLiteStatement.mo5794bindNull(38);
                sQLiteStatement.mo5794bindNull(39);
                sQLiteStatement.mo5794bindNull(40);
                sQLiteStatement.mo5794bindNull(41);
                sQLiteStatement.mo5794bindNull(42);
                sQLiteStatement.mo5794bindNull(43);
                sQLiteStatement.mo5794bindNull(44);
                sQLiteStatement.mo5794bindNull(45);
                sQLiteStatement.mo5794bindNull(46);
                sQLiteStatement.mo5794bindNull(47);
                sQLiteStatement.mo5794bindNull(48);
                sQLiteStatement.mo5794bindNull(49);
            }
            InHouseIMGroupCampaign groupCampaign = inHouseIMGroupEntity.getGroupCampaign();
            if (groupCampaign != null) {
                if (groupCampaign.getActivityId() == null) {
                    sQLiteStatement.mo5794bindNull(50);
                } else {
                    sQLiteStatement.mo5793bindLong(50, groupCampaign.getActivityId().intValue());
                }
                if (groupCampaign.getUrlSlug() == null) {
                    sQLiteStatement.mo5794bindNull(51);
                } else {
                    sQLiteStatement.mo5795bindText(51, groupCampaign.getUrlSlug());
                }
                if (groupCampaign.getUrlSubPath() == null) {
                    sQLiteStatement.mo5794bindNull(52);
                } else {
                    sQLiteStatement.mo5795bindText(52, groupCampaign.getUrlSubPath());
                }
                if (groupCampaign.getCampaignStartTime() == null) {
                    sQLiteStatement.mo5794bindNull(53);
                } else {
                    sQLiteStatement.mo5795bindText(53, groupCampaign.getCampaignStartTime());
                }
                if (groupCampaign.getCampaignEndTime() == null) {
                    sQLiteStatement.mo5794bindNull(54);
                } else {
                    sQLiteStatement.mo5795bindText(54, groupCampaign.getCampaignEndTime());
                }
                if (groupCampaign.getRegistrationStartTime() == null) {
                    sQLiteStatement.mo5794bindNull(55);
                } else {
                    sQLiteStatement.mo5795bindText(55, groupCampaign.getRegistrationStartTime());
                }
                if (groupCampaign.getMinAppVersion() == null) {
                    sQLiteStatement.mo5794bindNull(56);
                } else {
                    sQLiteStatement.mo5795bindText(56, groupCampaign.getMinAppVersion());
                }
            } else {
                sQLiteStatement.mo5794bindNull(50);
                sQLiteStatement.mo5794bindNull(51);
                sQLiteStatement.mo5794bindNull(52);
                sQLiteStatement.mo5794bindNull(53);
                sQLiteStatement.mo5794bindNull(54);
                sQLiteStatement.mo5794bindNull(55);
                sQLiteStatement.mo5794bindNull(56);
            }
            InHouseIMSuperGroupConfig superGroupConfig = inHouseIMGroupEntity.getSuperGroupConfig();
            if (superGroupConfig != null) {
                sQLiteStatement.mo5793bindLong(57, superGroupConfig.getShowSuperGroupUpgradeStatus());
                if (superGroupConfig.getOrbiterPlusExpiryTimestamp() == null) {
                    sQLiteStatement.mo5794bindNull(58);
                } else {
                    sQLiteStatement.mo5793bindLong(58, superGroupConfig.getOrbiterPlusExpiryTimestamp().longValue());
                }
                if (superGroupConfig.getCapacity() == null) {
                    sQLiteStatement.mo5794bindNull(59);
                    return;
                } else {
                    sQLiteStatement.mo5793bindLong(59, superGroupConfig.getCapacity().intValue());
                    return;
                }
            }
            sQLiteStatement.mo5794bindNull(57);
            sQLiteStatement.mo5794bindNull(58);
            sQLiteStatement.mo5794bindNull(59);
        }
    };
    public final EntityDeleteOrUpdateAdapter<InHouseIMGroupEntity> KWHzl = new EntityDeleteOrUpdateAdapter<InHouseIMGroupEntity>() { // from class: o.sJs.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `in_house_im_group` SET `group_id` = ?,`group_master_id` = ?,`group_name` = ?,`biz_group_name` = ?,`group_avatar` = ?,`group_notice` = ?,`noticeEditTime` = ?,`group_desc` = ?,`is_store` = ?,`is_verify` = ?,`is_asset` = ?,`is_pay` = ?,`asset_currency_id` = ?,`asset_currency_symbol` = ?,`asset_amount` = ?,`pay_currency_id` = ?,`pay_currency_symbol` = ?,`pay_amount` = ?,`status` = ?,`timestamp` = ?,`create_time` = ?,`update_time` = ?,`group_count` = ?,`v1` = ?,`v2` = ?,`v3` = ?,`allowMentionOthers` = ?,`isCanTransferOwnership` = ?,`type` = ?,`userGroupPermission` = ?,`groupVoiceCallConfig` = ?,`allowMembersToAddMembers` = ?,`allowSharingInvitationQrCode` = ?,`requireAdminApprovalToJoin` = ?,`pendingJoinRequests` = ?,`maxMemberCount` = ?,`public_group_type` = ?,`paidGroupInfo_outstandingAmount` = ?,`paidGroupInfo_billingModel_enabled` = ?,`paidGroupInfo_billingModel_currencyId` = ?,`paidGroupInfo_billingModel_currencyCode` = ?,`paidGroupInfo_billingModel_currencySign` = ?,`paidGroupInfo_billingModel_amount` = ?,`paidGroupInfo_billingModel_billingType` = ?,`paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus` = ?,`paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime` = ?,`paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime` = ?,`paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus` = ?,`paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus` = ?,`campaign_activityId` = ?,`campaign_urlSlug` = ?,`campaign_urlSubPath` = ?,`campaign_campaignStartTime` = ?,`campaign_campaignEndTime` = ?,`campaign_registrationStartTime` = ?,`campaign_minAppVersion` = ?,`superGroupConfig_showSuperGroupUpgradeStatus` = ?,`superGroupConfig_orbiterPlusExpiryTimestamp` = ?,`superGroupConfig_capacity` = ? WHERE `group_id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMGroupEntity inHouseIMGroupEntity) {
            if (inHouseIMGroupEntity.getGroupId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMGroupEntity.getGroupId());
            }
            if (inHouseIMGroupEntity.getMasterId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMGroupEntity.getMasterId());
            }
            if (inHouseIMGroupEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, inHouseIMGroupEntity.getName());
            }
            if (inHouseIMGroupEntity.getBizGroupName() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, inHouseIMGroupEntity.getBizGroupName());
            }
            if (inHouseIMGroupEntity.getAvatar() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, inHouseIMGroupEntity.getAvatar());
            }
            if (inHouseIMGroupEntity.getNotice() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, inHouseIMGroupEntity.getNotice());
            }
            sQLiteStatement.mo5793bindLong(7, inHouseIMGroupEntity.getNoticeEditTime());
            if (inHouseIMGroupEntity.getDescription() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, inHouseIMGroupEntity.getDescription());
            }
            sQLiteStatement.mo5793bindLong(9, inHouseIMGroupEntity.getStoreStatus());
            sQLiteStatement.mo5793bindLong(10, inHouseIMGroupEntity.getNeedVerifyStatus());
            sQLiteStatement.mo5793bindLong(11, inHouseIMGroupEntity.getAssetStatus());
            sQLiteStatement.mo5793bindLong(12, inHouseIMGroupEntity.getPayStatus());
            if (inHouseIMGroupEntity.getAssetCurrencyId() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5793bindLong(13, inHouseIMGroupEntity.getAssetCurrencyId().intValue());
            }
            if (inHouseIMGroupEntity.getAssetCurrencySymbol() == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, inHouseIMGroupEntity.getAssetCurrencySymbol());
            }
            if (inHouseIMGroupEntity.getAssetAmount() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5792bindDouble(15, inHouseIMGroupEntity.getAssetAmount().doubleValue());
            }
            if (inHouseIMGroupEntity.getPayCurrencyId() == null) {
                sQLiteStatement.mo5794bindNull(16);
            } else {
                sQLiteStatement.mo5793bindLong(16, inHouseIMGroupEntity.getPayCurrencyId().intValue());
            }
            if (inHouseIMGroupEntity.getPayCurrencySymbol() == null) {
                sQLiteStatement.mo5794bindNull(17);
            } else {
                sQLiteStatement.mo5795bindText(17, inHouseIMGroupEntity.getPayCurrencySymbol());
            }
            if (inHouseIMGroupEntity.getPayAmount() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5792bindDouble(18, inHouseIMGroupEntity.getPayAmount().doubleValue());
            }
            sQLiteStatement.mo5793bindLong(19, inHouseIMGroupEntity.getStatus());
            sQLiteStatement.mo5793bindLong(20, inHouseIMGroupEntity.getTimestamp());
            sQLiteStatement.mo5793bindLong(21, inHouseIMGroupEntity.getCreateTime());
            sQLiteStatement.mo5793bindLong(22, inHouseIMGroupEntity.getUpdateTime());
            sQLiteStatement.mo5793bindLong(23, inHouseIMGroupEntity.getGroupCount());
            if (inHouseIMGroupEntity.getV1Field() == null) {
                sQLiteStatement.mo5794bindNull(24);
            } else {
                sQLiteStatement.mo5795bindText(24, inHouseIMGroupEntity.getV1Field());
            }
            if (inHouseIMGroupEntity.getV2Field() == null) {
                sQLiteStatement.mo5794bindNull(25);
            } else {
                sQLiteStatement.mo5795bindText(25, inHouseIMGroupEntity.getV2Field());
            }
            if (inHouseIMGroupEntity.getV3Field() == null) {
                sQLiteStatement.mo5794bindNull(26);
            } else {
                sQLiteStatement.mo5795bindText(26, inHouseIMGroupEntity.getV3Field());
            }
            if (inHouseIMGroupEntity.getAllowMentionOthers() == null) {
                sQLiteStatement.mo5794bindNull(27);
            } else {
                sQLiteStatement.mo5793bindLong(27, inHouseIMGroupEntity.getAllowMentionOthers().intValue());
            }
            if (inHouseIMGroupEntity.getCanTransferOwnership() == null) {
                sQLiteStatement.mo5794bindNull(28);
            } else {
                sQLiteStatement.mo5793bindLong(28, inHouseIMGroupEntity.getCanTransferOwnership().intValue());
            }
            if (inHouseIMGroupEntity.getType() == null) {
                sQLiteStatement.mo5794bindNull(29);
            } else {
                sQLiteStatement.mo5793bindLong(29, inHouseIMGroupEntity.getType().intValue());
            }
            java.lang.String strOLrzqt = C44273sJs.this.copydefault.OLrzqt(inHouseIMGroupEntity.getUserGroupPermission());
            if (strOLrzqt == null) {
                sQLiteStatement.mo5794bindNull(30);
            } else {
                sQLiteStatement.mo5795bindText(30, strOLrzqt);
            }
            java.lang.String strOLrzqt2 = C44273sJs.this.AEQbTJ.OLrzqt(inHouseIMGroupEntity.getGroupVoiceCallConfig());
            if (strOLrzqt2 == null) {
                sQLiteStatement.mo5794bindNull(31);
            } else {
                sQLiteStatement.mo5795bindText(31, strOLrzqt2);
            }
            if (inHouseIMGroupEntity.getAllowMembersToAddMembers() == null) {
                sQLiteStatement.mo5794bindNull(32);
            } else {
                sQLiteStatement.mo5793bindLong(32, inHouseIMGroupEntity.getAllowMembersToAddMembers().intValue());
            }
            if (inHouseIMGroupEntity.getAllowSharingInvitationQrCode() == null) {
                sQLiteStatement.mo5794bindNull(33);
            } else {
                sQLiteStatement.mo5793bindLong(33, inHouseIMGroupEntity.getAllowSharingInvitationQrCode().intValue());
            }
            if (inHouseIMGroupEntity.getRequireAdminApprovalToJoin() == null) {
                sQLiteStatement.mo5794bindNull(34);
            } else {
                sQLiteStatement.mo5793bindLong(34, inHouseIMGroupEntity.getRequireAdminApprovalToJoin().intValue());
            }
            if (inHouseIMGroupEntity.getPendingJoinRequests() == null) {
                sQLiteStatement.mo5794bindNull(35);
            } else {
                sQLiteStatement.mo5793bindLong(35, inHouseIMGroupEntity.getPendingJoinRequests().intValue());
            }
            if (inHouseIMGroupEntity.getMaxMemberCount() == null) {
                sQLiteStatement.mo5794bindNull(36);
            } else {
                sQLiteStatement.mo5793bindLong(36, inHouseIMGroupEntity.getMaxMemberCount().longValue());
            }
            if (inHouseIMGroupEntity.getPublicGroupType() == null) {
                sQLiteStatement.mo5794bindNull(37);
            } else {
                sQLiteStatement.mo5795bindText(37, C44273sJs.this.OLrzqt(inHouseIMGroupEntity.getPublicGroupType()));
            }
            PaidGroupInfo paidGroupInfo = inHouseIMGroupEntity.getPaidGroupInfo();
            if (paidGroupInfo != null) {
                if (paidGroupInfo.getOutstandingAmount() == null) {
                    sQLiteStatement.mo5794bindNull(38);
                } else {
                    sQLiteStatement.mo5795bindText(38, paidGroupInfo.getOutstandingAmount());
                }
                GroupEntryBillingModel billingModel = paidGroupInfo.getBillingModel();
                if (billingModel != null) {
                    if (billingModel.getEnabled() == null) {
                        sQLiteStatement.mo5794bindNull(39);
                    } else {
                        sQLiteStatement.mo5795bindText(39, C44273sJs.this.EZpvd(billingModel.getEnabled()));
                    }
                    if (billingModel.getCurrencyId() == null) {
                        sQLiteStatement.mo5794bindNull(40);
                    } else {
                        sQLiteStatement.mo5793bindLong(40, billingModel.getCurrencyId().intValue());
                    }
                    if (billingModel.getCurrencyCode() == null) {
                        sQLiteStatement.mo5794bindNull(41);
                    } else {
                        sQLiteStatement.mo5795bindText(41, billingModel.getCurrencyCode());
                    }
                    if (billingModel.getCurrencySign() == null) {
                        sQLiteStatement.mo5794bindNull(42);
                    } else {
                        sQLiteStatement.mo5795bindText(42, billingModel.getCurrencySign());
                    }
                    if (billingModel.getAmount() == null) {
                        sQLiteStatement.mo5794bindNull(43);
                    } else {
                        sQLiteStatement.mo5795bindText(43, billingModel.getAmount());
                    }
                    if (billingModel.getBillingType() == null) {
                        sQLiteStatement.mo5794bindNull(44);
                    } else {
                        sQLiteStatement.mo5795bindText(44, C44273sJs.this.EZpvd(billingModel.getBillingType()));
                    }
                } else {
                    sQLiteStatement.mo5794bindNull(39);
                    sQLiteStatement.mo5794bindNull(40);
                    sQLiteStatement.mo5794bindNull(41);
                    sQLiteStatement.mo5794bindNull(42);
                    sQLiteStatement.mo5794bindNull(43);
                    sQLiteStatement.mo5794bindNull(44);
                }
                PaidGroupMemberStatus paidGroupMemberStatus = paidGroupInfo.getPaidGroupMemberStatus();
                if (paidGroupMemberStatus != null) {
                    if (paidGroupMemberStatus.getPaymentRequiredStatus() == null) {
                        sQLiteStatement.mo5794bindNull(45);
                    } else {
                        sQLiteStatement.mo5795bindText(45, C44273sJs.this.OLrzqt(paidGroupMemberStatus.getPaymentRequiredStatus()));
                    }
                    if (paidGroupMemberStatus.getLastPaymentDatetime() == null) {
                        sQLiteStatement.mo5794bindNull(46);
                    } else {
                        sQLiteStatement.mo5793bindLong(46, paidGroupMemberStatus.getLastPaymentDatetime().longValue());
                    }
                    if (paidGroupMemberStatus.getNextPaymentDatetime() == null) {
                        sQLiteStatement.mo5794bindNull(47);
                    } else {
                        sQLiteStatement.mo5793bindLong(47, paidGroupMemberStatus.getNextPaymentDatetime().longValue());
                    }
                    if (paidGroupMemberStatus.getPaidGroupBillingStatus() == null) {
                        sQLiteStatement.mo5794bindNull(48);
                    } else {
                        sQLiteStatement.mo5795bindText(48, C44273sJs.this.EZpvd(paidGroupMemberStatus.getPaidGroupBillingStatus()));
                    }
                    if (paidGroupMemberStatus.getBillingCyclePaymentStatus() == null) {
                        sQLiteStatement.mo5794bindNull(49);
                    } else {
                        sQLiteStatement.mo5795bindText(49, C44273sJs.this.KWHzl(paidGroupMemberStatus.getBillingCyclePaymentStatus()));
                    }
                } else {
                    sQLiteStatement.mo5794bindNull(45);
                    sQLiteStatement.mo5794bindNull(46);
                    sQLiteStatement.mo5794bindNull(47);
                    sQLiteStatement.mo5794bindNull(48);
                    sQLiteStatement.mo5794bindNull(49);
                }
            } else {
                sQLiteStatement.mo5794bindNull(38);
                sQLiteStatement.mo5794bindNull(39);
                sQLiteStatement.mo5794bindNull(40);
                sQLiteStatement.mo5794bindNull(41);
                sQLiteStatement.mo5794bindNull(42);
                sQLiteStatement.mo5794bindNull(43);
                sQLiteStatement.mo5794bindNull(44);
                sQLiteStatement.mo5794bindNull(45);
                sQLiteStatement.mo5794bindNull(46);
                sQLiteStatement.mo5794bindNull(47);
                sQLiteStatement.mo5794bindNull(48);
                sQLiteStatement.mo5794bindNull(49);
            }
            InHouseIMGroupCampaign groupCampaign = inHouseIMGroupEntity.getGroupCampaign();
            if (groupCampaign != null) {
                if (groupCampaign.getActivityId() == null) {
                    sQLiteStatement.mo5794bindNull(50);
                } else {
                    sQLiteStatement.mo5793bindLong(50, groupCampaign.getActivityId().intValue());
                }
                if (groupCampaign.getUrlSlug() == null) {
                    sQLiteStatement.mo5794bindNull(51);
                } else {
                    sQLiteStatement.mo5795bindText(51, groupCampaign.getUrlSlug());
                }
                if (groupCampaign.getUrlSubPath() == null) {
                    sQLiteStatement.mo5794bindNull(52);
                } else {
                    sQLiteStatement.mo5795bindText(52, groupCampaign.getUrlSubPath());
                }
                if (groupCampaign.getCampaignStartTime() == null) {
                    sQLiteStatement.mo5794bindNull(53);
                } else {
                    sQLiteStatement.mo5795bindText(53, groupCampaign.getCampaignStartTime());
                }
                if (groupCampaign.getCampaignEndTime() == null) {
                    sQLiteStatement.mo5794bindNull(54);
                } else {
                    sQLiteStatement.mo5795bindText(54, groupCampaign.getCampaignEndTime());
                }
                if (groupCampaign.getRegistrationStartTime() == null) {
                    sQLiteStatement.mo5794bindNull(55);
                } else {
                    sQLiteStatement.mo5795bindText(55, groupCampaign.getRegistrationStartTime());
                }
                if (groupCampaign.getMinAppVersion() == null) {
                    sQLiteStatement.mo5794bindNull(56);
                } else {
                    sQLiteStatement.mo5795bindText(56, groupCampaign.getMinAppVersion());
                }
            } else {
                sQLiteStatement.mo5794bindNull(50);
                sQLiteStatement.mo5794bindNull(51);
                sQLiteStatement.mo5794bindNull(52);
                sQLiteStatement.mo5794bindNull(53);
                sQLiteStatement.mo5794bindNull(54);
                sQLiteStatement.mo5794bindNull(55);
                sQLiteStatement.mo5794bindNull(56);
            }
            InHouseIMSuperGroupConfig superGroupConfig = inHouseIMGroupEntity.getSuperGroupConfig();
            if (superGroupConfig != null) {
                sQLiteStatement.mo5793bindLong(57, superGroupConfig.getShowSuperGroupUpgradeStatus());
                if (superGroupConfig.getOrbiterPlusExpiryTimestamp() == null) {
                    sQLiteStatement.mo5794bindNull(58);
                } else {
                    sQLiteStatement.mo5793bindLong(58, superGroupConfig.getOrbiterPlusExpiryTimestamp().longValue());
                }
                if (superGroupConfig.getCapacity() == null) {
                    sQLiteStatement.mo5794bindNull(59);
                } else {
                    sQLiteStatement.mo5793bindLong(59, superGroupConfig.getCapacity().intValue());
                }
            } else {
                sQLiteStatement.mo5794bindNull(57);
                sQLiteStatement.mo5794bindNull(58);
                sQLiteStatement.mo5794bindNull(59);
            }
            if (inHouseIMGroupEntity.getGroupId() == null) {
                sQLiteStatement.mo5794bindNull(60);
            } else {
                sQLiteStatement.mo5795bindText(60, inHouseIMGroupEntity.getGroupId());
            }
        }
    };

    public C44273sJs(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public java.lang.Object insert(final InHouseIMGroupEntity inHouseIMGroupEntity, Continuation<? super Unit> continuation) {
        inHouseIMGroupEntity.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.KWHzl(inHouseIMGroupEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(InHouseIMGroupEntity inHouseIMGroupEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, inHouseIMGroupEntity);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public java.lang.Object update(final InHouseIMGroupEntity inHouseIMGroupEntity, Continuation<? super Unit> continuation) {
        inHouseIMGroupEntity.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(inHouseIMGroupEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit AEQbTJ(InHouseIMGroupEntity inHouseIMGroupEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.KWHzl.handle(sQLiteConnection, inHouseIMGroupEntity);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public java.lang.Object getGroupInfoById(final java.lang.String str, Continuation<? super InHouseIMGroupEntity> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.sJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ab A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03bf A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ce A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03dd A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ec A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fb A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040a A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041f A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0441 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0452 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0470 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0482 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0494 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a6 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b8 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ca A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e5 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x051f A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0536 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0548 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x055e A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0575 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0587 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05cc A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05de A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05f0 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0602 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0619 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0630 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0647 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0661 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x067b A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0692 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06a9 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06c0 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06d7 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ed A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ InHouseIMGroupEntity KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        GroupEntryBillingModel groupEntryBillingModel;
        PaidGroupMemberStatus paidGroupMemberStatus;
        PaidGroupInfo paidGroupInfo;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InHouseIMGroupCampaign inHouseIMGroupCampaign;
        int i8;
        InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM in_house_im_group WHERE group_id = ? ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_master_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "biz_group_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_avatar");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_notice");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "noticeEditTime");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_desc");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_store");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_asset");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_pay");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_currency_id");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_currency_symbol");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_amount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_currency_id");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_currency_symbol");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_amount");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_count");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowMentionOthers");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCanTransferOwnership");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userGroupPermission");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupVoiceCallConfig");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowMembersToAddMembers");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowSharingInvitationQrCode");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requireAdminApprovalToJoin");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingJoinRequests");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maxMemberCount");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "public_group_type");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_outstandingAmount");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_enabled");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencyId");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencyCode");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencySign");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_amount");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_billingType");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_activityId");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_urlSlug");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_urlSubPath");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_campaignStartTime");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_campaignEndTime");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_registrationStartTime");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_minAppVersion");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_showSuperGroupUpgradeStatus");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_orbiterPlusExpiryTimestamp");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_capacity");
            InHouseIMGroupEntity inHouseIMGroupEntity = null;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow38) && sQLiteStatementPrepare.isNull(columnIndexOrThrow39) && sQLiteStatementPrepare.isNull(columnIndexOrThrow40) && sQLiteStatementPrepare.isNull(columnIndexOrThrow41) && sQLiteStatementPrepare.isNull(columnIndexOrThrow42) && sQLiteStatementPrepare.isNull(columnIndexOrThrow43) && sQLiteStatementPrepare.isNull(columnIndexOrThrow44) && sQLiteStatementPrepare.isNull(columnIndexOrThrow45) && sQLiteStatementPrepare.isNull(columnIndexOrThrow46) && sQLiteStatementPrepare.isNull(columnIndexOrThrow47) && sQLiteStatementPrepare.isNull(columnIndexOrThrow48) && sQLiteStatementPrepare.isNull(columnIndexOrThrow49)) {
                    paidGroupInfo = null;
                } else {
                    java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow39) && sQLiteStatementPrepare.isNull(columnIndexOrThrow40) && sQLiteStatementPrepare.isNull(columnIndexOrThrow41) && sQLiteStatementPrepare.isNull(columnIndexOrThrow42) && sQLiteStatementPrepare.isNull(columnIndexOrThrow43) && sQLiteStatementPrepare.isNull(columnIndexOrThrow44)) {
                        groupEntryBillingModel = null;
                    } else {
                        groupEntryBillingModel = new GroupEntryBillingModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow39)), sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow40)), sQLiteStatementPrepare.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow41), sQLiteStatementPrepare.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow42), sQLiteStatementPrepare.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow43), sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow44)));
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow45) && sQLiteStatementPrepare.isNull(columnIndexOrThrow46) && sQLiteStatementPrepare.isNull(columnIndexOrThrow47) && sQLiteStatementPrepare.isNull(columnIndexOrThrow48) && sQLiteStatementPrepare.isNull(columnIndexOrThrow49)) {
                        paidGroupMemberStatus = null;
                    } else {
                        paidGroupMemberStatus = new PaidGroupMemberStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow45) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow45)), sQLiteStatementPrepare.isNull(columnIndexOrThrow46) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow46)), sQLiteStatementPrepare.isNull(columnIndexOrThrow47) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow47)), sQLiteStatementPrepare.isNull(columnIndexOrThrow48) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow48)), sQLiteStatementPrepare.isNull(columnIndexOrThrow49) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow49)));
                    }
                    paidGroupInfo = new PaidGroupInfo(groupEntryBillingModel, paidGroupMemberStatus, text);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow50)) {
                    i = columnIndexOrThrow51;
                    if (sQLiteStatementPrepare.isNull(i)) {
                        i2 = columnIndexOrThrow52;
                        if (sQLiteStatementPrepare.isNull(i2)) {
                            i3 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i3)) {
                                i4 = columnIndexOrThrow54;
                                if (sQLiteStatementPrepare.isNull(i4)) {
                                    i5 = columnIndexOrThrow55;
                                    if (sQLiteStatementPrepare.isNull(i5)) {
                                        i6 = columnIndexOrThrow56;
                                        if (sQLiteStatementPrepare.isNull(i6)) {
                                            i7 = columnIndexOrThrow57;
                                            inHouseIMGroupCampaign = null;
                                            if (sQLiteStatementPrepare.isNull(i7)) {
                                                i8 = columnIndexOrThrow58;
                                                if (sQLiteStatementPrepare.isNull(i8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow59)) {
                                                    inHouseIMSuperGroupConfig = null;
                                                }
                                                InHouseIMGroupEntity inHouseIMGroupEntity2 = new InHouseIMGroupEntity();
                                                inHouseIMGroupEntity2.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                                inHouseIMGroupEntity2.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                                inHouseIMGroupEntity2.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                                inHouseIMGroupEntity2.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                                inHouseIMGroupEntity2.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                                inHouseIMGroupEntity2.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                                inHouseIMGroupEntity2.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                                inHouseIMGroupEntity2.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                                inHouseIMGroupEntity2.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                                inHouseIMGroupEntity2.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                                inHouseIMGroupEntity2.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                                inHouseIMGroupEntity2.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                                inHouseIMGroupEntity2.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                                inHouseIMGroupEntity2.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                                inHouseIMGroupEntity2.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                                inHouseIMGroupEntity2.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                                inHouseIMGroupEntity2.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                                inHouseIMGroupEntity2.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                                inHouseIMGroupEntity2.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                                inHouseIMGroupEntity2.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                                inHouseIMGroupEntity2.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                                inHouseIMGroupEntity2.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                                inHouseIMGroupEntity2.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                                inHouseIMGroupEntity2.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                                inHouseIMGroupEntity2.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                                inHouseIMGroupEntity2.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                                inHouseIMGroupEntity2.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                                inHouseIMGroupEntity2.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                                inHouseIMGroupEntity2.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                                inHouseIMGroupEntity2.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                                inHouseIMGroupEntity2.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                                inHouseIMGroupEntity2.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                                inHouseIMGroupEntity2.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                                inHouseIMGroupEntity2.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                                inHouseIMGroupEntity2.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                                inHouseIMGroupEntity2.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                                inHouseIMGroupEntity2.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                                inHouseIMGroupEntity2.setPaidGroupInfo(paidGroupInfo);
                                                inHouseIMGroupEntity2.setGroupCampaign(inHouseIMGroupCampaign);
                                                inHouseIMGroupEntity2.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                                inHouseIMGroupEntity = inHouseIMGroupEntity2;
                                            } else {
                                                i8 = columnIndexOrThrow58;
                                            }
                                            inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                            InHouseIMGroupEntity inHouseIMGroupEntity22 = new InHouseIMGroupEntity();
                                            inHouseIMGroupEntity22.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                            inHouseIMGroupEntity22.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                            inHouseIMGroupEntity22.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                            inHouseIMGroupEntity22.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                            inHouseIMGroupEntity22.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                            inHouseIMGroupEntity22.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                            inHouseIMGroupEntity22.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                            inHouseIMGroupEntity22.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                            inHouseIMGroupEntity22.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                            inHouseIMGroupEntity22.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                            inHouseIMGroupEntity22.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                            inHouseIMGroupEntity22.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                            inHouseIMGroupEntity22.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                            inHouseIMGroupEntity22.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                            inHouseIMGroupEntity22.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                            inHouseIMGroupEntity22.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                            inHouseIMGroupEntity22.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                            inHouseIMGroupEntity22.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                            inHouseIMGroupEntity22.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                            inHouseIMGroupEntity22.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                            inHouseIMGroupEntity22.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                            inHouseIMGroupEntity22.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                            inHouseIMGroupEntity22.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                            inHouseIMGroupEntity22.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                            inHouseIMGroupEntity22.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                            inHouseIMGroupEntity22.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                            inHouseIMGroupEntity22.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                            inHouseIMGroupEntity22.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                            inHouseIMGroupEntity22.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                            inHouseIMGroupEntity22.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                            inHouseIMGroupEntity22.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                            inHouseIMGroupEntity22.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                            inHouseIMGroupEntity22.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                            inHouseIMGroupEntity22.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                            inHouseIMGroupEntity22.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                            inHouseIMGroupEntity22.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                            inHouseIMGroupEntity22.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                            inHouseIMGroupEntity22.setPaidGroupInfo(paidGroupInfo);
                                            inHouseIMGroupEntity22.setGroupCampaign(inHouseIMGroupCampaign);
                                            inHouseIMGroupEntity22.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                            inHouseIMGroupEntity = inHouseIMGroupEntity22;
                                        }
                                    }
                                    inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                                    i7 = columnIndexOrThrow57;
                                    if (sQLiteStatementPrepare.isNull(i7)) {
                                    }
                                    inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                    InHouseIMGroupEntity inHouseIMGroupEntity222 = new InHouseIMGroupEntity();
                                    inHouseIMGroupEntity222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                    inHouseIMGroupEntity222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                    inHouseIMGroupEntity222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                    inHouseIMGroupEntity222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                    inHouseIMGroupEntity222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                    inHouseIMGroupEntity222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                    inHouseIMGroupEntity222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                    inHouseIMGroupEntity222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                    inHouseIMGroupEntity222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                    inHouseIMGroupEntity222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                    inHouseIMGroupEntity222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                    inHouseIMGroupEntity222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                    inHouseIMGroupEntity222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                    inHouseIMGroupEntity222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                    inHouseIMGroupEntity222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                    inHouseIMGroupEntity222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                    inHouseIMGroupEntity222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                    inHouseIMGroupEntity222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                    inHouseIMGroupEntity222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                    inHouseIMGroupEntity222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                    inHouseIMGroupEntity222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                    inHouseIMGroupEntity222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                    inHouseIMGroupEntity222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                    inHouseIMGroupEntity222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                    inHouseIMGroupEntity222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                    inHouseIMGroupEntity222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                    inHouseIMGroupEntity222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                    inHouseIMGroupEntity222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                    inHouseIMGroupEntity222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                    inHouseIMGroupEntity222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                    inHouseIMGroupEntity222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                    inHouseIMGroupEntity222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                    inHouseIMGroupEntity222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                    inHouseIMGroupEntity222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                    inHouseIMGroupEntity222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                    inHouseIMGroupEntity222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                    inHouseIMGroupEntity222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                    inHouseIMGroupEntity222.setPaidGroupInfo(paidGroupInfo);
                                    inHouseIMGroupEntity222.setGroupCampaign(inHouseIMGroupCampaign);
                                    inHouseIMGroupEntity222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                    inHouseIMGroupEntity = inHouseIMGroupEntity222;
                                }
                                i6 = columnIndexOrThrow56;
                                inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                                i7 = columnIndexOrThrow57;
                                if (sQLiteStatementPrepare.isNull(i7)) {
                                }
                                inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                InHouseIMGroupEntity inHouseIMGroupEntity2222 = new InHouseIMGroupEntity();
                                inHouseIMGroupEntity2222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                inHouseIMGroupEntity2222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                inHouseIMGroupEntity2222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                inHouseIMGroupEntity2222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                inHouseIMGroupEntity2222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                inHouseIMGroupEntity2222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                inHouseIMGroupEntity2222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                inHouseIMGroupEntity2222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                inHouseIMGroupEntity2222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                inHouseIMGroupEntity2222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                inHouseIMGroupEntity2222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                inHouseIMGroupEntity2222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                inHouseIMGroupEntity2222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                inHouseIMGroupEntity2222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                inHouseIMGroupEntity2222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                inHouseIMGroupEntity2222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                inHouseIMGroupEntity2222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                inHouseIMGroupEntity2222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                inHouseIMGroupEntity2222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                inHouseIMGroupEntity2222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                inHouseIMGroupEntity2222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                inHouseIMGroupEntity2222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                inHouseIMGroupEntity2222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                inHouseIMGroupEntity2222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                inHouseIMGroupEntity2222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                inHouseIMGroupEntity2222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                inHouseIMGroupEntity2222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                inHouseIMGroupEntity2222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                inHouseIMGroupEntity2222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                inHouseIMGroupEntity2222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                inHouseIMGroupEntity2222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                inHouseIMGroupEntity2222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                inHouseIMGroupEntity2222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                inHouseIMGroupEntity2222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                inHouseIMGroupEntity2222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                inHouseIMGroupEntity2222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                inHouseIMGroupEntity2222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                inHouseIMGroupEntity2222.setPaidGroupInfo(paidGroupInfo);
                                inHouseIMGroupEntity2222.setGroupCampaign(inHouseIMGroupCampaign);
                                inHouseIMGroupEntity2222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                inHouseIMGroupEntity = inHouseIMGroupEntity2222;
                            }
                            i5 = columnIndexOrThrow55;
                            i6 = columnIndexOrThrow56;
                            inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                            i7 = columnIndexOrThrow57;
                            if (sQLiteStatementPrepare.isNull(i7)) {
                            }
                            inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                            InHouseIMGroupEntity inHouseIMGroupEntity22222 = new InHouseIMGroupEntity();
                            inHouseIMGroupEntity22222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            inHouseIMGroupEntity22222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                            inHouseIMGroupEntity22222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                            inHouseIMGroupEntity22222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                            inHouseIMGroupEntity22222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                            inHouseIMGroupEntity22222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                            inHouseIMGroupEntity22222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                            inHouseIMGroupEntity22222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                            inHouseIMGroupEntity22222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                            inHouseIMGroupEntity22222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                            inHouseIMGroupEntity22222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                            inHouseIMGroupEntity22222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                            inHouseIMGroupEntity22222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                            inHouseIMGroupEntity22222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                            inHouseIMGroupEntity22222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                            inHouseIMGroupEntity22222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                            inHouseIMGroupEntity22222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                            inHouseIMGroupEntity22222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                            inHouseIMGroupEntity22222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                            inHouseIMGroupEntity22222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                            inHouseIMGroupEntity22222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                            inHouseIMGroupEntity22222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                            inHouseIMGroupEntity22222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                            inHouseIMGroupEntity22222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                            inHouseIMGroupEntity22222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                            inHouseIMGroupEntity22222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                            inHouseIMGroupEntity22222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                            inHouseIMGroupEntity22222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                            inHouseIMGroupEntity22222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                            inHouseIMGroupEntity22222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                            inHouseIMGroupEntity22222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                            inHouseIMGroupEntity22222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                            inHouseIMGroupEntity22222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                            inHouseIMGroupEntity22222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                            inHouseIMGroupEntity22222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                            inHouseIMGroupEntity22222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                            inHouseIMGroupEntity22222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                            inHouseIMGroupEntity22222.setPaidGroupInfo(paidGroupInfo);
                            inHouseIMGroupEntity22222.setGroupCampaign(inHouseIMGroupCampaign);
                            inHouseIMGroupEntity22222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                            inHouseIMGroupEntity = inHouseIMGroupEntity22222;
                        }
                        i4 = columnIndexOrThrow54;
                        i5 = columnIndexOrThrow55;
                        i6 = columnIndexOrThrow56;
                        inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                        i7 = columnIndexOrThrow57;
                        if (sQLiteStatementPrepare.isNull(i7)) {
                        }
                        inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                        InHouseIMGroupEntity inHouseIMGroupEntity222222 = new InHouseIMGroupEntity();
                        inHouseIMGroupEntity222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        inHouseIMGroupEntity222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        inHouseIMGroupEntity222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        inHouseIMGroupEntity222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                        inHouseIMGroupEntity222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        inHouseIMGroupEntity222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        inHouseIMGroupEntity222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                        inHouseIMGroupEntity222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        inHouseIMGroupEntity222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                        inHouseIMGroupEntity222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                        inHouseIMGroupEntity222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                        inHouseIMGroupEntity222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                        inHouseIMGroupEntity222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                        inHouseIMGroupEntity222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                        inHouseIMGroupEntity222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                        inHouseIMGroupEntity222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                        inHouseIMGroupEntity222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                        inHouseIMGroupEntity222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                        inHouseIMGroupEntity222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                        inHouseIMGroupEntity222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                        inHouseIMGroupEntity222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                        inHouseIMGroupEntity222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                        inHouseIMGroupEntity222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                        inHouseIMGroupEntity222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                        inHouseIMGroupEntity222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                        inHouseIMGroupEntity222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                        inHouseIMGroupEntity222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                        inHouseIMGroupEntity222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                        inHouseIMGroupEntity222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                        inHouseIMGroupEntity222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                        inHouseIMGroupEntity222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                        inHouseIMGroupEntity222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                        inHouseIMGroupEntity222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                        inHouseIMGroupEntity222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                        inHouseIMGroupEntity222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                        inHouseIMGroupEntity222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                        inHouseIMGroupEntity222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                        inHouseIMGroupEntity222222.setPaidGroupInfo(paidGroupInfo);
                        inHouseIMGroupEntity222222.setGroupCampaign(inHouseIMGroupCampaign);
                        inHouseIMGroupEntity222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                        inHouseIMGroupEntity = inHouseIMGroupEntity222222;
                    }
                    i3 = columnIndexOrThrow53;
                    i4 = columnIndexOrThrow54;
                    i5 = columnIndexOrThrow55;
                    i6 = columnIndexOrThrow56;
                    inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                    i7 = columnIndexOrThrow57;
                    if (sQLiteStatementPrepare.isNull(i7)) {
                    }
                    inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                    InHouseIMGroupEntity inHouseIMGroupEntity2222222 = new InHouseIMGroupEntity();
                    inHouseIMGroupEntity2222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                    inHouseIMGroupEntity2222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    inHouseIMGroupEntity2222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                    inHouseIMGroupEntity2222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                    inHouseIMGroupEntity2222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                    inHouseIMGroupEntity2222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    inHouseIMGroupEntity2222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                    inHouseIMGroupEntity2222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                    inHouseIMGroupEntity2222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                    inHouseIMGroupEntity2222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                    inHouseIMGroupEntity2222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                    inHouseIMGroupEntity2222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                    inHouseIMGroupEntity2222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                    inHouseIMGroupEntity2222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                    inHouseIMGroupEntity2222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                    inHouseIMGroupEntity2222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                    inHouseIMGroupEntity2222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                    inHouseIMGroupEntity2222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                    inHouseIMGroupEntity2222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                    inHouseIMGroupEntity2222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                    inHouseIMGroupEntity2222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                    inHouseIMGroupEntity2222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                    inHouseIMGroupEntity2222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                    inHouseIMGroupEntity2222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                    inHouseIMGroupEntity2222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                    inHouseIMGroupEntity2222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                    inHouseIMGroupEntity2222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                    inHouseIMGroupEntity2222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                    inHouseIMGroupEntity2222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                    inHouseIMGroupEntity2222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                    inHouseIMGroupEntity2222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                    inHouseIMGroupEntity2222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                    inHouseIMGroupEntity2222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                    inHouseIMGroupEntity2222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                    inHouseIMGroupEntity2222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                    inHouseIMGroupEntity2222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                    inHouseIMGroupEntity2222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                    inHouseIMGroupEntity2222222.setPaidGroupInfo(paidGroupInfo);
                    inHouseIMGroupEntity2222222.setGroupCampaign(inHouseIMGroupCampaign);
                    inHouseIMGroupEntity2222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                    inHouseIMGroupEntity = inHouseIMGroupEntity2222222;
                } else {
                    i = columnIndexOrThrow51;
                }
                i2 = columnIndexOrThrow52;
                i3 = columnIndexOrThrow53;
                i4 = columnIndexOrThrow54;
                i5 = columnIndexOrThrow55;
                i6 = columnIndexOrThrow56;
                inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                i7 = columnIndexOrThrow57;
                if (sQLiteStatementPrepare.isNull(i7)) {
                }
                inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                InHouseIMGroupEntity inHouseIMGroupEntity22222222 = new InHouseIMGroupEntity();
                inHouseIMGroupEntity22222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                inHouseIMGroupEntity22222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupEntity22222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                inHouseIMGroupEntity22222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                inHouseIMGroupEntity22222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupEntity22222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupEntity22222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                inHouseIMGroupEntity22222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                inHouseIMGroupEntity22222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                inHouseIMGroupEntity22222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                inHouseIMGroupEntity22222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                inHouseIMGroupEntity22222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                inHouseIMGroupEntity22222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                inHouseIMGroupEntity22222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                inHouseIMGroupEntity22222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                inHouseIMGroupEntity22222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                inHouseIMGroupEntity22222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                inHouseIMGroupEntity22222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                inHouseIMGroupEntity22222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                inHouseIMGroupEntity22222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                inHouseIMGroupEntity22222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                inHouseIMGroupEntity22222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                inHouseIMGroupEntity22222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                inHouseIMGroupEntity22222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                inHouseIMGroupEntity22222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                inHouseIMGroupEntity22222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                inHouseIMGroupEntity22222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                inHouseIMGroupEntity22222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                inHouseIMGroupEntity22222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                inHouseIMGroupEntity22222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                inHouseIMGroupEntity22222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                inHouseIMGroupEntity22222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                inHouseIMGroupEntity22222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                inHouseIMGroupEntity22222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                inHouseIMGroupEntity22222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                inHouseIMGroupEntity22222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                inHouseIMGroupEntity22222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                inHouseIMGroupEntity22222222.setPaidGroupInfo(paidGroupInfo);
                inHouseIMGroupEntity22222222.setGroupCampaign(inHouseIMGroupCampaign);
                inHouseIMGroupEntity22222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                inHouseIMGroupEntity = inHouseIMGroupEntity22222222;
            }
            return inHouseIMGroupEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public Flow<InHouseIMGroupEntity> getGroupInfoByIdFlow(final java.lang.String str) {
        return FlowUtil.createFlow(this.EZpvd, false, new java.lang.String[]{"in_house_im_group"}, new Function1() { // from class: o.sJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ab A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03bf A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ce A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03dd A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ec A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fb A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040a A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041f A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0441 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0452 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0470 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0482 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0494 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a6 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b8 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ca A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e5 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x051f A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0536 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0548 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x055e A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0575 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0587 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05cc A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05de A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05f0 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0602 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0619 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0630 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0647 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0661 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x067b A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0692 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06a9 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06c0 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06d7 A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ed A[Catch: all -> 0x0708, TryCatch #0 {all -> 0x0708, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x01da, B:10:0x01e0, B:12:0x01e6, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:22:0x0204, B:24:0x020a, B:26:0x0210, B:28:0x0216, B:30:0x021c, B:111:0x0359, B:113:0x035f, B:115:0x0367, B:117:0x036f, B:119:0x0377, B:121:0x037f, B:123:0x0387, B:133:0x03a2, B:137:0x03b6, B:141:0x03c5, B:145:0x03d4, B:149:0x03e3, B:153:0x03f2, B:157:0x0401, B:161:0x0410, B:162:0x0419, B:164:0x041f, B:166:0x0427, B:180:0x0460, B:184:0x0474, B:188:0x0486, B:192:0x0498, B:196:0x04aa, B:200:0x04bc, B:204:0x04ce, B:208:0x04e9, B:212:0x0528, B:216:0x053a, B:220:0x0550, B:224:0x0567, B:228:0x0579, B:232:0x058f, B:236:0x05d0, B:240:0x05e2, B:244:0x05f4, B:248:0x060b, B:252:0x0622, B:256:0x0639, B:260:0x064b, B:264:0x0665, B:268:0x0684, B:272:0x069b, B:276:0x06b2, B:280:0x06c9, B:284:0x06df, B:288:0x06f6, B:287:0x06ed, B:283:0x06d7, B:279:0x06c0, B:275:0x06a9, B:271:0x0692, B:267:0x067b, B:263:0x0661, B:259:0x0647, B:255:0x0630, B:251:0x0619, B:247:0x0602, B:243:0x05f0, B:239:0x05de, B:235:0x05cc, B:231:0x0587, B:227:0x0575, B:223:0x055e, B:219:0x0548, B:215:0x0536, B:211:0x051f, B:207:0x04e5, B:203:0x04ca, B:199:0x04b8, B:195:0x04a6, B:191:0x0494, B:187:0x0482, B:183:0x0470, B:171:0x0433, B:175:0x0449, B:179:0x045b, B:178:0x0452, B:174:0x0441, B:160:0x040a, B:156:0x03fb, B:152:0x03ec, B:148:0x03dd, B:144:0x03ce, B:140:0x03bf, B:136:0x03ab, B:34:0x0227, B:38:0x0234, B:40:0x023a, B:42:0x0240, B:44:0x0246, B:46:0x024c, B:48:0x0252, B:77:0x02cb, B:79:0x02d1, B:81:0x02d7, B:83:0x02dd, B:85:0x02e3, B:110:0x0354, B:89:0x02ee, B:93:0x0301, B:97:0x0314, B:101:0x0327, B:105:0x033a, B:109:0x034d, B:108:0x0343, B:104:0x0330, B:100:0x031d, B:96:0x030a, B:92:0x02f7, B:52:0x025d, B:56:0x0270, B:60:0x0284, B:64:0x0293, B:68:0x02a2, B:72:0x02b1, B:76:0x02c4, B:75:0x02ba, B:71:0x02ab, B:67:0x029c, B:63:0x028d, B:59:0x0279, B:55:0x0266, B:37:0x0230, B:5:0x0013), top: B:295:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ InHouseIMGroupEntity copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        GroupEntryBillingModel groupEntryBillingModel;
        PaidGroupMemberStatus paidGroupMemberStatus;
        PaidGroupInfo paidGroupInfo;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InHouseIMGroupCampaign inHouseIMGroupCampaign;
        int i8;
        InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM in_house_im_group WHERE group_id = ? ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_master_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "biz_group_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_avatar");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_notice");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "noticeEditTime");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_desc");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_store");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_verify");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_asset");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "is_pay");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_currency_id");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_currency_symbol");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_amount");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_currency_id");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_currency_symbol");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pay_amount");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_count");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowMentionOthers");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCanTransferOwnership");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userGroupPermission");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupVoiceCallConfig");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowMembersToAddMembers");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowSharingInvitationQrCode");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requireAdminApprovalToJoin");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pendingJoinRequests");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maxMemberCount");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "public_group_type");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_outstandingAmount");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_enabled");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencyId");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencyCode");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_currencySign");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_amount");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_billingModel_billingType");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_activityId");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_urlSlug");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_urlSubPath");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_campaignStartTime");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_campaignEndTime");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_registrationStartTime");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "campaign_minAppVersion");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_showSuperGroupUpgradeStatus");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_orbiterPlusExpiryTimestamp");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "superGroupConfig_capacity");
            InHouseIMGroupEntity inHouseIMGroupEntity = null;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow38) && sQLiteStatementPrepare.isNull(columnIndexOrThrow39) && sQLiteStatementPrepare.isNull(columnIndexOrThrow40) && sQLiteStatementPrepare.isNull(columnIndexOrThrow41) && sQLiteStatementPrepare.isNull(columnIndexOrThrow42) && sQLiteStatementPrepare.isNull(columnIndexOrThrow43) && sQLiteStatementPrepare.isNull(columnIndexOrThrow44) && sQLiteStatementPrepare.isNull(columnIndexOrThrow45) && sQLiteStatementPrepare.isNull(columnIndexOrThrow46) && sQLiteStatementPrepare.isNull(columnIndexOrThrow47) && sQLiteStatementPrepare.isNull(columnIndexOrThrow48) && sQLiteStatementPrepare.isNull(columnIndexOrThrow49)) {
                    paidGroupInfo = null;
                } else {
                    java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow39) && sQLiteStatementPrepare.isNull(columnIndexOrThrow40) && sQLiteStatementPrepare.isNull(columnIndexOrThrow41) && sQLiteStatementPrepare.isNull(columnIndexOrThrow42) && sQLiteStatementPrepare.isNull(columnIndexOrThrow43) && sQLiteStatementPrepare.isNull(columnIndexOrThrow44)) {
                        groupEntryBillingModel = null;
                    } else {
                        groupEntryBillingModel = new GroupEntryBillingModel(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow39)), sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow40)), sQLiteStatementPrepare.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow41), sQLiteStatementPrepare.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow42), sQLiteStatementPrepare.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow43), sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow44)));
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow45) && sQLiteStatementPrepare.isNull(columnIndexOrThrow46) && sQLiteStatementPrepare.isNull(columnIndexOrThrow47) && sQLiteStatementPrepare.isNull(columnIndexOrThrow48) && sQLiteStatementPrepare.isNull(columnIndexOrThrow49)) {
                        paidGroupMemberStatus = null;
                    } else {
                        paidGroupMemberStatus = new PaidGroupMemberStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow45) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow45)), sQLiteStatementPrepare.isNull(columnIndexOrThrow46) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow46)), sQLiteStatementPrepare.isNull(columnIndexOrThrow47) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow47)), sQLiteStatementPrepare.isNull(columnIndexOrThrow48) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow48)), sQLiteStatementPrepare.isNull(columnIndexOrThrow49) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow49)));
                    }
                    paidGroupInfo = new PaidGroupInfo(groupEntryBillingModel, paidGroupMemberStatus, text);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow50)) {
                    i = columnIndexOrThrow51;
                    if (sQLiteStatementPrepare.isNull(i)) {
                        i2 = columnIndexOrThrow52;
                        if (sQLiteStatementPrepare.isNull(i2)) {
                            i3 = columnIndexOrThrow53;
                            if (sQLiteStatementPrepare.isNull(i3)) {
                                i4 = columnIndexOrThrow54;
                                if (sQLiteStatementPrepare.isNull(i4)) {
                                    i5 = columnIndexOrThrow55;
                                    if (sQLiteStatementPrepare.isNull(i5)) {
                                        i6 = columnIndexOrThrow56;
                                        if (sQLiteStatementPrepare.isNull(i6)) {
                                            i7 = columnIndexOrThrow57;
                                            inHouseIMGroupCampaign = null;
                                            if (sQLiteStatementPrepare.isNull(i7)) {
                                                i8 = columnIndexOrThrow58;
                                                if (sQLiteStatementPrepare.isNull(i8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow59)) {
                                                    inHouseIMSuperGroupConfig = null;
                                                }
                                                InHouseIMGroupEntity inHouseIMGroupEntity2 = new InHouseIMGroupEntity();
                                                inHouseIMGroupEntity2.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                                inHouseIMGroupEntity2.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                                inHouseIMGroupEntity2.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                                inHouseIMGroupEntity2.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                                inHouseIMGroupEntity2.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                                inHouseIMGroupEntity2.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                                inHouseIMGroupEntity2.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                                inHouseIMGroupEntity2.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                                inHouseIMGroupEntity2.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                                inHouseIMGroupEntity2.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                                inHouseIMGroupEntity2.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                                inHouseIMGroupEntity2.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                                inHouseIMGroupEntity2.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                                inHouseIMGroupEntity2.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                                inHouseIMGroupEntity2.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                                inHouseIMGroupEntity2.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                                inHouseIMGroupEntity2.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                                inHouseIMGroupEntity2.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                                inHouseIMGroupEntity2.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                                inHouseIMGroupEntity2.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                                inHouseIMGroupEntity2.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                                inHouseIMGroupEntity2.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                                inHouseIMGroupEntity2.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                                inHouseIMGroupEntity2.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                                inHouseIMGroupEntity2.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                                inHouseIMGroupEntity2.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                                inHouseIMGroupEntity2.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                                inHouseIMGroupEntity2.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                                inHouseIMGroupEntity2.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                                inHouseIMGroupEntity2.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                                inHouseIMGroupEntity2.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                                inHouseIMGroupEntity2.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                                inHouseIMGroupEntity2.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                                inHouseIMGroupEntity2.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                                inHouseIMGroupEntity2.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                                inHouseIMGroupEntity2.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                                inHouseIMGroupEntity2.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                                inHouseIMGroupEntity2.setPaidGroupInfo(paidGroupInfo);
                                                inHouseIMGroupEntity2.setGroupCampaign(inHouseIMGroupCampaign);
                                                inHouseIMGroupEntity2.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                                inHouseIMGroupEntity = inHouseIMGroupEntity2;
                                            } else {
                                                i8 = columnIndexOrThrow58;
                                            }
                                            inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                            InHouseIMGroupEntity inHouseIMGroupEntity22 = new InHouseIMGroupEntity();
                                            inHouseIMGroupEntity22.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                            inHouseIMGroupEntity22.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                            inHouseIMGroupEntity22.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                            inHouseIMGroupEntity22.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                            inHouseIMGroupEntity22.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                            inHouseIMGroupEntity22.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                            inHouseIMGroupEntity22.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                            inHouseIMGroupEntity22.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                            inHouseIMGroupEntity22.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                            inHouseIMGroupEntity22.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                            inHouseIMGroupEntity22.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                            inHouseIMGroupEntity22.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                            inHouseIMGroupEntity22.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                            inHouseIMGroupEntity22.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                            inHouseIMGroupEntity22.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                            inHouseIMGroupEntity22.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                            inHouseIMGroupEntity22.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                            inHouseIMGroupEntity22.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                            inHouseIMGroupEntity22.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                            inHouseIMGroupEntity22.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                            inHouseIMGroupEntity22.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                            inHouseIMGroupEntity22.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                            inHouseIMGroupEntity22.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                            inHouseIMGroupEntity22.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                            inHouseIMGroupEntity22.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                            inHouseIMGroupEntity22.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                            inHouseIMGroupEntity22.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                            inHouseIMGroupEntity22.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                            inHouseIMGroupEntity22.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                            inHouseIMGroupEntity22.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                            inHouseIMGroupEntity22.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                            inHouseIMGroupEntity22.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                            inHouseIMGroupEntity22.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                            inHouseIMGroupEntity22.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                            inHouseIMGroupEntity22.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                            inHouseIMGroupEntity22.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                            inHouseIMGroupEntity22.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                            inHouseIMGroupEntity22.setPaidGroupInfo(paidGroupInfo);
                                            inHouseIMGroupEntity22.setGroupCampaign(inHouseIMGroupCampaign);
                                            inHouseIMGroupEntity22.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                            inHouseIMGroupEntity = inHouseIMGroupEntity22;
                                        }
                                    }
                                    inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                                    i7 = columnIndexOrThrow57;
                                    if (sQLiteStatementPrepare.isNull(i7)) {
                                    }
                                    inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                    InHouseIMGroupEntity inHouseIMGroupEntity222 = new InHouseIMGroupEntity();
                                    inHouseIMGroupEntity222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                    inHouseIMGroupEntity222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                    inHouseIMGroupEntity222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                    inHouseIMGroupEntity222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                    inHouseIMGroupEntity222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                    inHouseIMGroupEntity222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                    inHouseIMGroupEntity222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                    inHouseIMGroupEntity222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                    inHouseIMGroupEntity222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                    inHouseIMGroupEntity222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                    inHouseIMGroupEntity222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                    inHouseIMGroupEntity222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                    inHouseIMGroupEntity222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                    inHouseIMGroupEntity222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                    inHouseIMGroupEntity222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                    inHouseIMGroupEntity222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                    inHouseIMGroupEntity222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                    inHouseIMGroupEntity222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                    inHouseIMGroupEntity222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                    inHouseIMGroupEntity222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                    inHouseIMGroupEntity222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                    inHouseIMGroupEntity222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                    inHouseIMGroupEntity222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                    inHouseIMGroupEntity222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                    inHouseIMGroupEntity222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                    inHouseIMGroupEntity222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                    inHouseIMGroupEntity222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                    inHouseIMGroupEntity222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                    inHouseIMGroupEntity222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                    inHouseIMGroupEntity222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                    inHouseIMGroupEntity222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                    inHouseIMGroupEntity222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                    inHouseIMGroupEntity222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                    inHouseIMGroupEntity222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                    inHouseIMGroupEntity222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                    inHouseIMGroupEntity222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                    inHouseIMGroupEntity222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                    inHouseIMGroupEntity222.setPaidGroupInfo(paidGroupInfo);
                                    inHouseIMGroupEntity222.setGroupCampaign(inHouseIMGroupCampaign);
                                    inHouseIMGroupEntity222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                    inHouseIMGroupEntity = inHouseIMGroupEntity222;
                                }
                                i6 = columnIndexOrThrow56;
                                inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                                i7 = columnIndexOrThrow57;
                                if (sQLiteStatementPrepare.isNull(i7)) {
                                }
                                inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                                InHouseIMGroupEntity inHouseIMGroupEntity2222 = new InHouseIMGroupEntity();
                                inHouseIMGroupEntity2222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                                inHouseIMGroupEntity2222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                                inHouseIMGroupEntity2222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                                inHouseIMGroupEntity2222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                                inHouseIMGroupEntity2222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                                inHouseIMGroupEntity2222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                                inHouseIMGroupEntity2222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                inHouseIMGroupEntity2222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                                inHouseIMGroupEntity2222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                                inHouseIMGroupEntity2222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                                inHouseIMGroupEntity2222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                                inHouseIMGroupEntity2222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                                inHouseIMGroupEntity2222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                                inHouseIMGroupEntity2222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                                inHouseIMGroupEntity2222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                                inHouseIMGroupEntity2222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                                inHouseIMGroupEntity2222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                                inHouseIMGroupEntity2222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                                inHouseIMGroupEntity2222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                                inHouseIMGroupEntity2222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                                inHouseIMGroupEntity2222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                                inHouseIMGroupEntity2222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                                inHouseIMGroupEntity2222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                                inHouseIMGroupEntity2222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                                inHouseIMGroupEntity2222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                                inHouseIMGroupEntity2222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                                inHouseIMGroupEntity2222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                                inHouseIMGroupEntity2222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                                inHouseIMGroupEntity2222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                                inHouseIMGroupEntity2222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                                inHouseIMGroupEntity2222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                                inHouseIMGroupEntity2222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                                inHouseIMGroupEntity2222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                                inHouseIMGroupEntity2222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                                inHouseIMGroupEntity2222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                                inHouseIMGroupEntity2222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                                inHouseIMGroupEntity2222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                                inHouseIMGroupEntity2222.setPaidGroupInfo(paidGroupInfo);
                                inHouseIMGroupEntity2222.setGroupCampaign(inHouseIMGroupCampaign);
                                inHouseIMGroupEntity2222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                                inHouseIMGroupEntity = inHouseIMGroupEntity2222;
                            }
                            i5 = columnIndexOrThrow55;
                            i6 = columnIndexOrThrow56;
                            inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                            i7 = columnIndexOrThrow57;
                            if (sQLiteStatementPrepare.isNull(i7)) {
                            }
                            inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                            InHouseIMGroupEntity inHouseIMGroupEntity22222 = new InHouseIMGroupEntity();
                            inHouseIMGroupEntity22222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                            inHouseIMGroupEntity22222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                            inHouseIMGroupEntity22222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                            inHouseIMGroupEntity22222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                            inHouseIMGroupEntity22222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                            inHouseIMGroupEntity22222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                            inHouseIMGroupEntity22222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                            inHouseIMGroupEntity22222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                            inHouseIMGroupEntity22222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                            inHouseIMGroupEntity22222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                            inHouseIMGroupEntity22222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                            inHouseIMGroupEntity22222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                            inHouseIMGroupEntity22222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                            inHouseIMGroupEntity22222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                            inHouseIMGroupEntity22222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                            inHouseIMGroupEntity22222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                            inHouseIMGroupEntity22222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                            inHouseIMGroupEntity22222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                            inHouseIMGroupEntity22222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                            inHouseIMGroupEntity22222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                            inHouseIMGroupEntity22222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                            inHouseIMGroupEntity22222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                            inHouseIMGroupEntity22222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                            inHouseIMGroupEntity22222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                            inHouseIMGroupEntity22222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                            inHouseIMGroupEntity22222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                            inHouseIMGroupEntity22222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                            inHouseIMGroupEntity22222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                            inHouseIMGroupEntity22222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                            inHouseIMGroupEntity22222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                            inHouseIMGroupEntity22222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                            inHouseIMGroupEntity22222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                            inHouseIMGroupEntity22222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                            inHouseIMGroupEntity22222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                            inHouseIMGroupEntity22222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                            inHouseIMGroupEntity22222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                            inHouseIMGroupEntity22222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                            inHouseIMGroupEntity22222.setPaidGroupInfo(paidGroupInfo);
                            inHouseIMGroupEntity22222.setGroupCampaign(inHouseIMGroupCampaign);
                            inHouseIMGroupEntity22222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                            inHouseIMGroupEntity = inHouseIMGroupEntity22222;
                        }
                        i4 = columnIndexOrThrow54;
                        i5 = columnIndexOrThrow55;
                        i6 = columnIndexOrThrow56;
                        inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                        i7 = columnIndexOrThrow57;
                        if (sQLiteStatementPrepare.isNull(i7)) {
                        }
                        inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                        InHouseIMGroupEntity inHouseIMGroupEntity222222 = new InHouseIMGroupEntity();
                        inHouseIMGroupEntity222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        inHouseIMGroupEntity222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        inHouseIMGroupEntity222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        inHouseIMGroupEntity222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                        inHouseIMGroupEntity222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        inHouseIMGroupEntity222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        inHouseIMGroupEntity222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                        inHouseIMGroupEntity222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        inHouseIMGroupEntity222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                        inHouseIMGroupEntity222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                        inHouseIMGroupEntity222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                        inHouseIMGroupEntity222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                        inHouseIMGroupEntity222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                        inHouseIMGroupEntity222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                        inHouseIMGroupEntity222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                        inHouseIMGroupEntity222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                        inHouseIMGroupEntity222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                        inHouseIMGroupEntity222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                        inHouseIMGroupEntity222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                        inHouseIMGroupEntity222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                        inHouseIMGroupEntity222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                        inHouseIMGroupEntity222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                        inHouseIMGroupEntity222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                        inHouseIMGroupEntity222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                        inHouseIMGroupEntity222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                        inHouseIMGroupEntity222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                        inHouseIMGroupEntity222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                        inHouseIMGroupEntity222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                        inHouseIMGroupEntity222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                        inHouseIMGroupEntity222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                        inHouseIMGroupEntity222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                        inHouseIMGroupEntity222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                        inHouseIMGroupEntity222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                        inHouseIMGroupEntity222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                        inHouseIMGroupEntity222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                        inHouseIMGroupEntity222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                        inHouseIMGroupEntity222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                        inHouseIMGroupEntity222222.setPaidGroupInfo(paidGroupInfo);
                        inHouseIMGroupEntity222222.setGroupCampaign(inHouseIMGroupCampaign);
                        inHouseIMGroupEntity222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                        inHouseIMGroupEntity = inHouseIMGroupEntity222222;
                    }
                    i3 = columnIndexOrThrow53;
                    i4 = columnIndexOrThrow54;
                    i5 = columnIndexOrThrow55;
                    i6 = columnIndexOrThrow56;
                    inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                    i7 = columnIndexOrThrow57;
                    if (sQLiteStatementPrepare.isNull(i7)) {
                    }
                    inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                    InHouseIMGroupEntity inHouseIMGroupEntity2222222 = new InHouseIMGroupEntity();
                    inHouseIMGroupEntity2222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                    inHouseIMGroupEntity2222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    inHouseIMGroupEntity2222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                    inHouseIMGroupEntity2222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                    inHouseIMGroupEntity2222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                    inHouseIMGroupEntity2222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    inHouseIMGroupEntity2222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                    inHouseIMGroupEntity2222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                    inHouseIMGroupEntity2222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                    inHouseIMGroupEntity2222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                    inHouseIMGroupEntity2222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                    inHouseIMGroupEntity2222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                    inHouseIMGroupEntity2222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                    inHouseIMGroupEntity2222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                    inHouseIMGroupEntity2222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                    inHouseIMGroupEntity2222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                    inHouseIMGroupEntity2222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                    inHouseIMGroupEntity2222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                    inHouseIMGroupEntity2222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                    inHouseIMGroupEntity2222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                    inHouseIMGroupEntity2222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                    inHouseIMGroupEntity2222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                    inHouseIMGroupEntity2222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                    inHouseIMGroupEntity2222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                    inHouseIMGroupEntity2222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                    inHouseIMGroupEntity2222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                    inHouseIMGroupEntity2222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                    inHouseIMGroupEntity2222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                    inHouseIMGroupEntity2222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                    inHouseIMGroupEntity2222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                    inHouseIMGroupEntity2222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                    inHouseIMGroupEntity2222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                    inHouseIMGroupEntity2222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                    inHouseIMGroupEntity2222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                    inHouseIMGroupEntity2222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                    inHouseIMGroupEntity2222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                    inHouseIMGroupEntity2222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                    inHouseIMGroupEntity2222222.setPaidGroupInfo(paidGroupInfo);
                    inHouseIMGroupEntity2222222.setGroupCampaign(inHouseIMGroupCampaign);
                    inHouseIMGroupEntity2222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                    inHouseIMGroupEntity = inHouseIMGroupEntity2222222;
                } else {
                    i = columnIndexOrThrow51;
                }
                i2 = columnIndexOrThrow52;
                i3 = columnIndexOrThrow53;
                i4 = columnIndexOrThrow54;
                i5 = columnIndexOrThrow55;
                i6 = columnIndexOrThrow56;
                inHouseIMGroupCampaign = new InHouseIMGroupCampaign(!sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow50)), !sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i), !sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), !sQLiteStatementPrepare.isNull(i3) ? null : sQLiteStatementPrepare.getText(i3), !sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), !sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5), !sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                i7 = columnIndexOrThrow57;
                if (sQLiteStatementPrepare.isNull(i7)) {
                }
                inHouseIMSuperGroupConfig = new InHouseIMSuperGroupConfig((int) sQLiteStatementPrepare.getLong(i7), sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow59)));
                InHouseIMGroupEntity inHouseIMGroupEntity22222222 = new InHouseIMGroupEntity();
                inHouseIMGroupEntity22222222.setGroupId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                inHouseIMGroupEntity22222222.setMasterId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupEntity22222222.setName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                inHouseIMGroupEntity22222222.setBizGroupName(!sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                inHouseIMGroupEntity22222222.setAvatar(!sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupEntity22222222.setNotice(!sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupEntity22222222.setNoticeEditTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                inHouseIMGroupEntity22222222.setDescription(!sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                inHouseIMGroupEntity22222222.setStoreStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                inHouseIMGroupEntity22222222.setNeedVerifyStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                inHouseIMGroupEntity22222222.setAssetStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                inHouseIMGroupEntity22222222.setPayStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                inHouseIMGroupEntity22222222.setAssetCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)));
                inHouseIMGroupEntity22222222.setAssetCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                inHouseIMGroupEntity22222222.setAssetAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow15)));
                inHouseIMGroupEntity22222222.setPayCurrencyId(!sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
                inHouseIMGroupEntity22222222.setPayCurrencySymbol(!sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                inHouseIMGroupEntity22222222.setPayAmount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : java.lang.Double.valueOf(sQLiteStatementPrepare.getDouble(columnIndexOrThrow18)));
                inHouseIMGroupEntity22222222.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                inHouseIMGroupEntity22222222.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                inHouseIMGroupEntity22222222.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                inHouseIMGroupEntity22222222.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow22));
                inHouseIMGroupEntity22222222.setGroupCount((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                inHouseIMGroupEntity22222222.setV1Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                inHouseIMGroupEntity22222222.setV2Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                inHouseIMGroupEntity22222222.setV3Field(!sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                inHouseIMGroupEntity22222222.setAllowMentionOthers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)));
                inHouseIMGroupEntity22222222.setCanTransferOwnership(!sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)));
                inHouseIMGroupEntity22222222.setType(!sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)));
                inHouseIMGroupEntity22222222.setUserGroupPermission(this.copydefault.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30)));
                inHouseIMGroupEntity22222222.setGroupVoiceCallConfig(this.AEQbTJ.KWHzl(!sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31)));
                inHouseIMGroupEntity22222222.setAllowMembersToAddMembers(!sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32)));
                inHouseIMGroupEntity22222222.setAllowSharingInvitationQrCode(!sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                inHouseIMGroupEntity22222222.setRequireAdminApprovalToJoin(!sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow34)));
                inHouseIMGroupEntity22222222.setPendingJoinRequests(!sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow35)));
                inHouseIMGroupEntity22222222.setMaxMemberCount(!sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow36)));
                inHouseIMGroupEntity22222222.setPublicGroupType(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow37)));
                inHouseIMGroupEntity22222222.setPaidGroupInfo(paidGroupInfo);
                inHouseIMGroupEntity22222222.setGroupCampaign(inHouseIMGroupCampaign);
                inHouseIMGroupEntity22222222.setSuperGroupConfig(inHouseIMSuperGroupConfig);
                inHouseIMGroupEntity = inHouseIMGroupEntity22222222;
            }
            return inHouseIMGroupEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public java.lang.Object deleteGroupInfoById(final java.lang.String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44273sJs.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM in_house_im_group WHERE group_id = ? ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao
    public void modifyNoticeShowStatus(final java.lang.String str, final java.lang.String str2) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.sJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44273sJs.EZpvd(str2, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE in_house_im_group SET v1=? WHERE group_id=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMGroupInfoDao.TaskDescription.OLrzqt(this);
    }

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }

    public final java.lang.String OLrzqt(@androidx.annotation.NonNull GroupPublicType groupPublicType) {
        int i = AnonymousClass3.EZpvd[groupPublicType.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "PRIVATE";
        }
        if (i == 3) {
            return "PUBLIC";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + groupPublicType);
    }

    public final java.lang.String EZpvd(@androidx.annotation.NonNull PaidGroupBillingStatus paidGroupBillingStatus) {
        int i = AnonymousClass3.copydefault[paidGroupBillingStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DISABLED";
        }
        if (i == 3) {
            return "ENABLED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + paidGroupBillingStatus);
    }

    public final java.lang.String EZpvd(@androidx.annotation.NonNull GroupBillingType groupBillingType) {
        int i = AnonymousClass3.KWHzl[groupBillingType.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "ONE_OFF";
        }
        if (i == 3) {
            return "MONTHLY";
        }
        if (i == 4) {
            return "YEARLY";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + groupBillingType);
    }

    public final java.lang.String OLrzqt(@androidx.annotation.NonNull PaymentRequiredStatus paymentRequiredStatus) {
        int i = AnonymousClass3.AEQbTJ[paymentRequiredStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "NOT_REQUIRED";
        }
        if (i == 3) {
            return "REQUIRED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + paymentRequiredStatus);
    }

    /* JADX INFO: renamed from: o.sJs$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[BillingCyclePaymentStatus.values().length];
            OLrzqt = iArr;
            try {
                iArr[BillingCyclePaymentStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[BillingCyclePaymentStatus.PAID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[BillingCyclePaymentStatus.OVERDUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[BillingCyclePaymentStatus.EXEMPTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[BillingCyclePaymentStatus.DUE_SOON.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[PaymentRequiredStatus.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[PaymentRequiredStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[PaymentRequiredStatus.NOT_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[PaymentRequiredStatus.REQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[GroupBillingType.values().length];
            KWHzl = iArr3;
            try {
                iArr3[GroupBillingType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                KWHzl[GroupBillingType.ONE_OFF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                KWHzl[GroupBillingType.MONTHLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                KWHzl[GroupBillingType.YEARLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[PaidGroupBillingStatus.values().length];
            copydefault = iArr4;
            try {
                iArr4[PaidGroupBillingStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                copydefault[PaidGroupBillingStatus.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                copydefault[PaidGroupBillingStatus.ENABLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            int[] iArr5 = new int[GroupPublicType.values().length];
            EZpvd = iArr5;
            try {
                iArr5[GroupPublicType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                EZpvd[GroupPublicType.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                EZpvd[GroupPublicType.PUBLIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    public final java.lang.String KWHzl(@androidx.annotation.NonNull BillingCyclePaymentStatus billingCyclePaymentStatus) {
        int i = AnonymousClass3.OLrzqt[billingCyclePaymentStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "PAID";
        }
        if (i == 3) {
            return "OVERDUE";
        }
        if (i == 4) {
            return "EXEMPTED";
        }
        if (i == 5) {
            return "DUE_SOON";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + billingCyclePaymentStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PaidGroupBillingStatus KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -891611359) {
            if (iHashCode != 433141802) {
                b = (iHashCode == 1053567612 && str.equals("DISABLED")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("UNKNOWN")) {
                b = 1;
            }
        } else if (str.equals("ENABLED")) {
            b = 0;
        }
        if (b == 0) {
            return PaidGroupBillingStatus.ENABLED;
        }
        if (b == 1) {
            return PaidGroupBillingStatus.UNKNOWN;
        }
        if (b == 2) {
            return PaidGroupBillingStatus.DISABLED;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GroupBillingType AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1681232246:
                b = !str.equals("YEARLY") ? (byte) -1 : (byte) 0;
                break;
            case -601948202:
                if (str.equals("ONE_OFF")) {
                    b = 1;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    b = 2;
                    break;
                }
                break;
            case 1954618349:
                if (str.equals("MONTHLY")) {
                    b = 3;
                    break;
                }
                break;
        }
        if (b == 0) {
            return GroupBillingType.YEARLY;
        }
        if (b == 1) {
            return GroupBillingType.ONE_OFF;
        }
        if (b == 2) {
            return GroupBillingType.UNKNOWN;
        }
        if (b == 3) {
            return GroupBillingType.MONTHLY;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PaymentRequiredStatus EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1888946261) {
            if (iHashCode != 389487519) {
                b = (iHashCode == 433141802 && str.equals("UNKNOWN")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("REQUIRED")) {
                b = 1;
            }
        } else if (str.equals("NOT_REQUIRED")) {
            b = 0;
        }
        if (b == 0) {
            return PaymentRequiredStatus.NOT_REQUIRED;
        }
        if (b == 1) {
            return PaymentRequiredStatus.REQUIRED;
        }
        if (b == 2) {
            return PaymentRequiredStatus.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BillingCyclePaymentStatus OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1553882938:
                b = !str.equals("DUE_SOON") ? (byte) -1 : (byte) 0;
                break;
            case -1460237122:
                if (str.equals("EXEMPTED")) {
                    b = 1;
                    break;
                }
                break;
            case -373312384:
                if (str.equals("OVERDUE")) {
                    b = 2;
                    break;
                }
                break;
            case 2448076:
                if (str.equals("PAID")) {
                    b = 3;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    b = 4;
                    break;
                }
                break;
        }
        if (b == 0) {
            return BillingCyclePaymentStatus.DUE_SOON;
        }
        if (b == 1) {
            return BillingCyclePaymentStatus.EXEMPTED;
        }
        if (b == 2) {
            return BillingCyclePaymentStatus.OVERDUE;
        }
        if (b == 3) {
            return BillingCyclePaymentStatus.PAID;
        }
        if (b == 4) {
            return BillingCyclePaymentStatus.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GroupPublicType copydefault(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1924094359) {
            if (iHashCode != 403485027) {
                b = (iHashCode == 433141802 && str.equals("UNKNOWN")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("PRIVATE")) {
                b = 1;
            }
        } else if (str.equals("PUBLIC")) {
            b = 0;
        }
        if (b == 0) {
            return GroupPublicType.PUBLIC;
        }
        if (b == 1) {
            return GroupPublicType.PRIVATE;
        }
        if (b == 2) {
            return GroupPublicType.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }
}
