package jp.co.example.controller;

import jp.co.example.vo.DanballOrderFormTop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("danball/form")		
public class DanballFormController {
	
	DanballOrderFormTop danballOrderFormTop = new DanballOrderFormTop();
	
	
	/**
	 * フォームトップ
	 * 
	 * */
	@RequestMapping(value="/init",method=RequestMethod.GET)
	public String init(Model model){
		model.addAttribute("danballOrderFormTop",danballOrderFormTop);
		return "danball/form/FormTop";
	}
	
	/**
	 * 問い合わせ結果の表示
	 * 
	 * */
	@RequestMapping(value="/calc",method=RequestMethod.POST)
	public String calc(@ModelAttribute DanballOrderFormTop danballOrderFormTop, Model model){
		// 入力内容が不正な場合入力画面再表示
		
		// シート平米数計算
		
		// DB問い合わせ
		
		// 平米あたりのシート単価を基に原材料費計算
		
		// 印刷加工が必要な場合の処理
		if(danballOrderFormTop.getPrintFlg()==1){
			// 判型の作成が必要な場合
			if(danballOrderFormTop.getPrintPlateFlg()==0){
				
			}
			// 印刷工賃の計算
		}
		// 送料の計算
		
		
		// View表示
		return "danball/form/FormCalc";
	}
	
	/**
	 * 問い合わせ内容確認の表示
	 * 
	 * */
	@RequestMapping(value="/chk",method=RequestMethod.POST)
	public String chk(@ModelAttribute DanballOrderFormTop danballOrderFormTop, Model model){
		// 確認ページの表示
		
		// View表示
		return "danball/form/FormChk";
	}
	
	/**
	 * 問い合わせ完了
	 * 
	 * */
	@RequestMapping(value="/finish",method=RequestMethod.GET)
	public String finish(@ModelAttribute DanballOrderFormTop danballOrderFormTop, Model model){
		// 問い合わせ履歴書き込み
		
		// メール送信
		
		// view表示
		return "danball/form/FormFinish";
	}

}
