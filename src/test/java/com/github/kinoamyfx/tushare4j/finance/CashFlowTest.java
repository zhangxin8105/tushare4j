package com.github.kinoamyfx.tushare4j.finance;

import com.github.kinoamyfx.tushare4j.utils.CodeUtils;

public class CashFlowTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>TS股票代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>公告日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>f_ann_date</td>\n" +
            "<td>str</td>\n" +
            "<td>实际公告日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_date</td>\n" +
            "<td>str</td>\n" +
            "<td>报告期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>comp_type</td>\n" +
            "<td>str</td>\n" +
            "<td>公司类型：1一般工商业 2银行 3保险 4证券</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>report_type</td>\n" +
            "<td>str</td>\n" +
            "<td>报表类型：见下方详细说明</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_profit</td>\n" +
            "<td>float</td>\n" +
            "<td>净利润 (元，下同)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>finan_exp</td>\n" +
            "<td>float</td>\n" +
            "<td>财务费用</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_fr_sale_sg</td>\n" +
            "<td>float</td>\n" +
            "<td>销售商品、提供劳务收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>recp_tax_rends</td>\n" +
            "<td>float</td>\n" +
            "<td>收到的税费返还</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_depos_incr_fi</td>\n" +
            "<td>float</td>\n" +
            "<td>客户存款和同业存放款项净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_loans_cb</td>\n" +
            "<td>float</td>\n" +
            "<td>向中央银行借款净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_inc_borr_oth_fi</td>\n" +
            "<td>float</td>\n" +
            "<td>向其他金融机构拆入资金净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>prem_fr_orig_contr</td>\n" +
            "<td>float</td>\n" +
            "<td>收到原保险合同保费取得的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_insured_dep</td>\n" +
            "<td>float</td>\n" +
            "<td>保户储金净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_reinsur_prem</td>\n" +
            "<td>float</td>\n" +
            "<td>收到再保业务现金净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_disp_tfa</td>\n" +
            "<td>float</td>\n" +
            "<td>处置交易性金融资产净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>ifc_cash_incr</td>\n" +
            "<td>float</td>\n" +
            "<td>收取利息和手续费净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_disp_faas</td>\n" +
            "<td>float</td>\n" +
            "<td>处置可供出售金融资产净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_loans_oth_bank</td>\n" +
            "<td>float</td>\n" +
            "<td>拆入资金净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_cap_incr_repur</td>\n" +
            "<td>float</td>\n" +
            "<td>回购业务资金净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_fr_oth_operate_a</td>\n" +
            "<td>float</td>\n" +
            "<td>收到其他与经营活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_inf_fr_operate_a</td>\n" +
            "<td>float</td>\n" +
            "<td>经营活动现金流入小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_paid_goods_s</td>\n" +
            "<td>float</td>\n" +
            "<td>购买商品、接受劳务支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_paid_to_for_empl</td>\n" +
            "<td>float</td>\n" +
            "<td>支付给职工以及为职工支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_paid_for_taxes</td>\n" +
            "<td>float</td>\n" +
            "<td>支付的各项税费</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_clt_loan_adv</td>\n" +
            "<td>float</td>\n" +
            "<td>客户贷款及垫款净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_dep_cbob</td>\n" +
            "<td>float</td>\n" +
            "<td>存放央行和同业款项净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_pay_claims_orig_inco</td>\n" +
            "<td>float</td>\n" +
            "<td>支付原保险合同赔付款项的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pay_handling_chrg</td>\n" +
            "<td>float</td>\n" +
            "<td>支付手续费的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>pay_comm_insur_plcy</td>\n" +
            "<td>float</td>\n" +
            "<td>支付保单红利的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oth_cash_pay_oper_act</td>\n" +
            "<td>float</td>\n" +
            "<td>支付其他与经营活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>st_cash_out_act</td>\n" +
            "<td>float</td>\n" +
            "<td>经营活动现金流出小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_cashflow_act</td>\n" +
            "<td>float</td>\n" +
            "<td>经营活动产生的现金流量净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oth_recp_ral_inv_act</td>\n" +
            "<td>float</td>\n" +
            "<td>收到其他与投资活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_disp_withdrwl_invest</td>\n" +
            "<td>float</td>\n" +
            "<td>收回投资收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_recp_return_invest</td>\n" +
            "<td>float</td>\n" +
            "<td>取得投资收益收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_recp_disp_fiolta</td>\n" +
            "<td>float</td>\n" +
            "<td>处置固定资产、无形资产和其他长期资产收回的现金净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_recp_disp_sobu</td>\n" +
            "<td>float</td>\n" +
            "<td>处置子公司及其他营业单位收到的现金净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stot_inflows_inv_act</td>\n" +
            "<td>float</td>\n" +
            "<td>投资活动现金流入小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_pay_acq_const_fiolta</td>\n" +
            "<td>float</td>\n" +
            "<td>购建固定资产、无形资产和其他长期资产支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_paid_invest</td>\n" +
            "<td>float</td>\n" +
            "<td>投资支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_disp_subs_oth_biz</td>\n" +
            "<td>float</td>\n" +
            "<td>取得子公司及其他营业单位支付的现金净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oth_pay_ral_inv_act</td>\n" +
            "<td>float</td>\n" +
            "<td>支付其他与投资活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_pledge_loan</td>\n" +
            "<td>float</td>\n" +
            "<td>质押贷款净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stot_out_inv_act</td>\n" +
            "<td>float</td>\n" +
            "<td>投资活动现金流出小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_cashflow_inv_act</td>\n" +
            "<td>float</td>\n" +
            "<td>投资活动产生的现金流量净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_recp_borrow</td>\n" +
            "<td>float</td>\n" +
            "<td>取得借款收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>proc_issue_bonds</td>\n" +
            "<td>float</td>\n" +
            "<td>发行债券收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oth_cash_recp_ral_fnc_act</td>\n" +
            "<td>float</td>\n" +
            "<td>收到其他与筹资活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stot_cash_in_fnc_act</td>\n" +
            "<td>float</td>\n" +
            "<td>筹资活动现金流入小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>free_cashflow</td>\n" +
            "<td>float</td>\n" +
            "<td>企业自由现金流量</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_prepay_amt_borr</td>\n" +
            "<td>float</td>\n" +
            "<td>偿还债务支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_pay_dist_dpcp_int_exp</td>\n" +
            "<td>float</td>\n" +
            "<td>分配股利、利润或偿付利息支付的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>incl_dvd_profit_paid_sc_ms</td>\n" +
            "<td>float</td>\n" +
            "<td>其中:子公司支付给少数股东的股利、利润</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>oth_cashpay_ral_fnc_act</td>\n" +
            "<td>float</td>\n" +
            "<td>支付其他与筹资活动有关的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>stot_cashout_fnc_act</td>\n" +
            "<td>float</td>\n" +
            "<td>筹资活动现金流出小计</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_cash_flows_fnc_act</td>\n" +
            "<td>float</td>\n" +
            "<td>筹资活动产生的现金流量净额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>eff_fx_flu_cash</td>\n" +
            "<td>float</td>\n" +
            "<td>汇率变动对现金的影响</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>n_incr_cash_cash_equ</td>\n" +
            "<td>float</td>\n" +
            "<td>现金及现金等价物净增加额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_cash_equ_beg_period</td>\n" +
            "<td>float</td>\n" +
            "<td>期初现金及现金等价物余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_cash_equ_end_period</td>\n" +
            "<td>float</td>\n" +
            "<td>期末现金及现金等价物余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>c_recp_cap_contrib</td>\n" +
            "<td>float</td>\n" +
            "<td>吸收投资收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>incl_cash_rec_saims</td>\n" +
            "<td>float</td>\n" +
            "<td>其中:子公司吸收少数股东投资收到的现金</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>uncon_invest_loss</td>\n" +
            "<td>float</td>\n" +
            "<td>未确认投资损失</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>prov_depr_assets</td>\n" +
            "<td>float</td>\n" +
            "<td>加:资产减值准备</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>depr_fa_coga_dpba</td>\n" +
            "<td>float</td>\n" +
            "<td>固定资产折旧、油气资产折耗、生产性生物资产折旧</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>amort_intang_assets</td>\n" +
            "<td>float</td>\n" +
            "<td>无形资产摊销</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>lt_amort_deferred_exp</td>\n" +
            "<td>float</td>\n" +
            "<td>长期待摊费用摊销</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>decr_deferred_exp</td>\n" +
            "<td>float</td>\n" +
            "<td>待摊费用减少</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>incr_acc_exp</td>\n" +
            "<td>float</td>\n" +
            "<td>预提费用增加</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>loss_disp_fiolta</td>\n" +
            "<td>float</td>\n" +
            "<td>处置固定、无形资产和其他长期资产的损失</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>loss_scr_fa</td>\n" +
            "<td>float</td>\n" +
            "<td>固定资产报废损失</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>loss_fv_chg</td>\n" +
            "<td>float</td>\n" +
            "<td>公允价值变动损失</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>invest_loss</td>\n" +
            "<td>float</td>\n" +
            "<td>投资损失</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>decr_def_inc_tax_assets</td>\n" +
            "<td>float</td>\n" +
            "<td>递延所得税资产减少</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>incr_def_inc_tax_liab</td>\n" +
            "<td>float</td>\n" +
            "<td>递延所得税负债增加</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>decr_inventories</td>\n" +
            "<td>float</td>\n" +
            "<td>存货的减少</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>decr_oper_payable</td>\n" +
            "<td>float</td>\n" +
            "<td>经营性应收项目的减少</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>incr_oper_payable</td>\n" +
            "<td>float</td>\n" +
            "<td>经营性应付项目的增加</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>others</td>\n" +
            "<td>float</td>\n" +
            "<td>其他</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>im_net_cashflow_oper_act</td>\n" +
            "<td>float</td>\n" +
            "<td>经营活动产生的现金流量净额(间接法)</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>conv_debt_into_cap</td>\n" +
            "<td>float</td>\n" +
            "<td>债务转为资本</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>conv_copbonds_due_within_1y</td>\n" +
            "<td>float</td>\n" +
            "<td>一年内到期的可转换公司债券</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>fa_fnc_leases</td>\n" +
            "<td>float</td>\n" +
            "<td>融资租入固定资产</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_bal_cash</td>\n" +
            "<td>float</td>\n" +
            "<td>现金的期末余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>beg_bal_cash</td>\n" +
            "<td>float</td>\n" +
            "<td>减:现金的期初余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>end_bal_cash_equ</td>\n" +
            "<td>float</td>\n" +
            "<td>加:现金等价物的期末余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>beg_bal_cash_equ</td>\n" +
            "<td>float</td>\n" +
            "<td>减:现金等价物的期初余额</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>im_n_incr_cash_equ</td>\n" +
            "<td>float</td>\n" +
            "<td>现金及现金等价物净增加额(间接法)</td>\n" +
            "</tr>\n" +
            "</tbody>";


    public void codeg() {
        CodeUtils.codeg3(content);
    }
}